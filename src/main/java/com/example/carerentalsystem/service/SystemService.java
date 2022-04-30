package com.example.carerentalsystem.service;

import com.example.carerentalsystem.dto.*;
import com.example.carerentalsystem.exception.SystemException;

/**
 * @author Hassan Wael
 */
public interface SystemService {

    BookAppointmentDto buyNewCar(BuyCarDto buyCarDto) throws SystemException;

    RentDto rentCar(RentCarDto rentCarDto) throws SystemException;

    String login(LoginRequestDto loginRequestDto) throws SystemException;

    String logout(String email) throws SystemException;

    String signUp(SignUpRequestDto signUpRequestDto) throws SystemException;

    String sellCar(SellCarDto sellCarDto) throws SystemException;


}
