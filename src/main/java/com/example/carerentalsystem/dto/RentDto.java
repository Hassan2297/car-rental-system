package com.example.carerentalsystem.dto;

import com.example.carerentalsystem.entity.Car;
import com.example.carerentalsystem.entity.User;

import java.time.LocalDate;

/**
 * @author Hassan Wael
 */
public class RentDto {

    private long id;

    private LocalDate bookCreatedDate;

    private LocalDate rentFromDate;

    private LocalDate rentToDate;

    private String pickupLocation;

    private String email;

    private Car car;

    public RentDto() {
    }

    public RentDto(long id, LocalDate bookCreatedDate, LocalDate rentFromDate, LocalDate rentToDate, String pickupLocation, String email, Car car) {
        this.id = id;
        this.bookCreatedDate = bookCreatedDate;
        this.rentFromDate = rentFromDate;
        this.rentToDate = rentToDate;
        this.pickupLocation = pickupLocation;
        this.email = email;
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getBookCreatedDate() {
        return bookCreatedDate;
    }

    public void setBookCreatedDate(LocalDate bookCreatedDate) {
        this.bookCreatedDate = bookCreatedDate;
    }

    public LocalDate getRentFromDate() {
        return rentFromDate;
    }

    public void setRentFromDate(LocalDate rentFromDate) {
        this.rentFromDate = rentFromDate;
    }

    public LocalDate getRentToDate() {
        return rentToDate;
    }

    public void setRentToDate(LocalDate rentToDate) {
        this.rentToDate = rentToDate;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "RentDto{" +
                "id=" + id +
                ", bookCreatedDate=" + bookCreatedDate +
                ", rentFromDate=" + rentFromDate +
                ", rentToDate=" + rentToDate +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", user=" + email +
                ", car=" + car +
                '}';
    }
}
