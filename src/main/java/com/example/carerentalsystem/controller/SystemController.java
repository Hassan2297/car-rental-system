package com.example.carerentalsystem.controller;

import com.example.carerentalsystem.dto.*;
import com.example.carerentalsystem.exception.SystemBadRequestException;
import com.example.carerentalsystem.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Hassan Wael
 */
@RestController
@RequestMapping("/api")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @PostMapping("/buy")
    public ResponseEntity<?> buyNewCar(@RequestBody @Valid BuyCarDto buyCarDto) {

        try {
            BookAppointmentDto resultDto = systemService.buyNewCar(buyCarDto);
            return new ResponseEntity<>(resultDto, null, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new SystemBadRequestException(ex.getMessage());
        }
    }

    @PostMapping("/rent")
    public ResponseEntity<?> rentCar(@RequestBody @Valid RentCarDto rentCarDto) {

        try {
            RentDto resultDto = systemService.rentCar(rentCarDto);
            return new ResponseEntity<>(resultDto, null, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new SystemBadRequestException(ex.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid LoginRequestDto loginRequestDto) {

        try {
            String result = systemService.login(loginRequestDto);
            return new ResponseEntity<>(result, null, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new SystemBadRequestException(ex.getMessage());
        }
    }

    @PostMapping("/logout/{email}")
    public ResponseEntity<?> logout(@PathVariable String email) {

        try {
            String result = systemService.logout(email);
            return new ResponseEntity<>(result, null, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new SystemBadRequestException(ex.getMessage());
        }
    }

    @PostMapping("/signUp")
    public ResponseEntity<?> logout(@RequestBody @Valid SignUpRequestDto signUpRequestDto) {

        try {
            String result = systemService.signUp(signUpRequestDto);
            return new ResponseEntity<>(result, null, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new SystemBadRequestException(ex.getMessage());
        }
    }

    @PostMapping("/sell")
    public ResponseEntity<?> sell(@RequestBody @Valid SellCarDto sellCarDto) {

        try {
            String result = systemService.sellCar(sellCarDto);
            return new ResponseEntity<>(result, null, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new SystemBadRequestException(ex.getMessage());
        }
    }
}
