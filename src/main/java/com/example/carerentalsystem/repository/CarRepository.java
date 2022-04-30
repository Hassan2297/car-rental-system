package com.example.carerentalsystem.repository;

import com.example.carerentalsystem.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hassan Wael
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByCarBrand(String carBrand);
    List<Car> findAllByCarModelAndCarBrand(String carModel, String carBrand);

    Car findByColorAndCarBrandAndCarModel(String color, String brand, String model);
}
