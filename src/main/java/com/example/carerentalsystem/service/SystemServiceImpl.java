package com.example.carerentalsystem.service;

import com.example.carerentalsystem.dto.*;
import com.example.carerentalsystem.entity.*;
import com.example.carerentalsystem.enums.CarType;
import com.example.carerentalsystem.enums.TransactionType;
import com.example.carerentalsystem.enums.TransmissionType;
import com.example.carerentalsystem.exception.SystemException;
import com.example.carerentalsystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Hassan Wael
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private BookAppoimentRepository bookAppoimentRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public BookAppointmentDto buyNewCar(BuyCarDto buyCarDto) throws SystemException {
        User user = userRepository.findByEmailAndLoggedInEquals(buyCarDto.getEmail(), true);
        if (user == null) {
            throw new SystemException("User is not found or not user is not logged in");
        }
        List<Car> allByCarBrand = carRepository.findAllByCarBrand(buyCarDto.getCarBrand());
        if (allByCarBrand.isEmpty()) {
            throw new SystemException("car brand not found");
        }

        List<Car> allByCarModel = carRepository.findAllByCarModelAndCarBrand(buyCarDto.getCarModel(), buyCarDto.getCarBrand());
        if (allByCarModel.isEmpty()) {
            throw new SystemException("car model not found");
        }

        Car carByColor = carRepository.findByColorAndCarBrandAndCarModel(buyCarDto.getColor(), buyCarDto.getCarBrand(), buyCarDto.getCarModel());
        if (carByColor == null) {
            throw new SystemException("car color is not found or not available!");
        }


        BookAppointment bookAppointment = new BookAppointment();
        bookAppointment.setBookCreatedDate(LocalDate.now());
        bookAppointment.setBookAppointmentDate(LocalDate.now().plusDays(2));
        bookAppointment.setCar(carByColor);
        bookAppointment.setUser(user);

        BookAppointment result = bookAppoimentRepository.save(bookAppointment);

        if (carByColor.getStock() <= 0) {
            throw new SystemException("No Stock available!");
        }
        carByColor.setStock(carByColor.getStock() - 1);
        carRepository.save(carByColor);

        Transaction transaction = new Transaction();
        transaction.setMobileNumber(user.getMobileNumber());
        transaction.setName(user.getName());
        transaction.setTransactionCreatedDate(LocalDate.now());
        transaction.setTransactionType(TransactionType.BUY);

        transactionRepository.save(transaction);

        return new BookAppointmentDto(result.getId(), result.getBookCreatedDate(),
                result.getBookAppointmentDate(), user.getEmail(), result.getCar());
    }

    @Override
    public RentDto rentCar(RentCarDto rentCarDto) throws SystemException {
        User user = userRepository.findByEmailAndLoggedInEquals(rentCarDto.getEmail(), true);
        if (user == null) {
            throw new SystemException("User is not found or not user is not logged in");
        }
        List<Car> allByCarBrand = carRepository.findAllByCarBrand(rentCarDto.getCarBrand());
        if (allByCarBrand.isEmpty()) {
            throw new SystemException("car brand not found");
        }

        List<Car> allByCarModel = carRepository.findAllByCarModelAndCarBrand(rentCarDto.getCarModel(), rentCarDto.getCarBrand());
        if (allByCarModel.isEmpty()) {
            throw new SystemException("car model not found");
        }

        Car carByColor = carRepository.findByColorAndCarBrandAndCarModel(rentCarDto.getColor(), rentCarDto.getCarBrand(), rentCarDto.getCarModel());
        if (carByColor == null) {
            throw new SystemException("car color is not found or not available!");
        }

        Rent rent = new Rent();
        rent.setBookCreatedDate(LocalDate.now());
        rent.setRentFromDate(rentCarDto.getFromDay());
        rent.setRentToDate(rentCarDto.getToDay());
        rent.setPickupLocation(rentCarDto.getPickupLocation());
        rent.setCar(carByColor);
        rent.setUser(user);

        Rent rentResult = rentRepository.save(rent);

        if (carByColor.getStock() <= 0) {
            throw new SystemException("No Stock available!");
        }
        carByColor.setStock(carByColor.getStock() - 1);
        carRepository.save(carByColor);

        Transaction transaction = new Transaction();
        transaction.setMobileNumber(user.getMobileNumber());
        transaction.setName(user.getName());
        transaction.setTransactionCreatedDate(LocalDate.now());
        transaction.setTransactionType(TransactionType.RENT);

        transactionRepository.save(transaction);

        return new RentDto(rentResult.getId(), rentResult.getBookCreatedDate(), rentResult.getRentFromDate(),
                rentResult.getRentToDate(), rentResult.getPickupLocation(), rentCarDto.getEmail(), rentResult.getCar());
    }

    @Override
    public String login(LoginRequestDto loginRequestDto) throws SystemException {
        User user = userRepository.findByEmailAndPassword(loginRequestDto.getEmail(), loginRequestDto.getPassword());
        if (user == null) {
            throw new SystemException("email or password are incorrect!");
        }
        user.setLoggedIn(true);
        userRepository.save(user);

        return "Successfully Logged in!";
    }

    @Override
    public String logout(String email) throws SystemException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new SystemException("email are incorrect!");
        }
        user.setLoggedIn(false);
        userRepository.save(user);

        return "Successfully Logged out!";
    }

    @Override
    public String signUp(SignUpRequestDto signUpRequestDto) throws SystemException {
        User user = userRepository.findByEmail(signUpRequestDto.getEmail());
        if (user != null) {
            throw new SystemException("email already exist!");
        }
        User createdUser = new User();
        createdUser.setLoggedIn(true);
        createdUser.setAddress(signUpRequestDto.getAddress());
        createdUser.setEmail(signUpRequestDto.getEmail());
        createdUser.setEnabled(true);
        createdUser.setMobileNumber(signUpRequestDto.getMobileNumber());
        createdUser.setName(signUpRequestDto.getName());
        createdUser.setPassword(signUpRequestDto.getPassword());

        userRepository.save(createdUser);


        return "Successfully Signed up";
    }

    @Override
    public String sellCar(SellCarDto sellCarDto) throws SystemException {
        User user = userRepository.findByEmailAndLoggedInEquals(sellCarDto.getEmail(), true);
        if (user == null) {
            throw new SystemException("User is not found or not user is not logged in");
        }

        Car car = new Car();
        car.setStock(1);
        car.setCarBrand(sellCarDto.getCarBrand());
        car.setCarModel(sellCarDto.getCarModel());
        car.setCarType(CarType.USED_CAR);
        car.setColor(sellCarDto.getColor());
        car.setPrice(sellCarDto.getPrice());
        car.setTransmissionType(TransmissionType.valueOf(sellCarDto.getTransmissionType()));

        carRepository.save(car);

        Transaction transaction = new Transaction();
        transaction.setMobileNumber(user.getMobileNumber());
        transaction.setName(user.getName());
        transaction.setTransactionCreatedDate(LocalDate.now());
        transaction.setTransactionType(TransactionType.SELL);

        transactionRepository.save(transaction);

        return "Saved in Our Cars Stock!";
    }
}
