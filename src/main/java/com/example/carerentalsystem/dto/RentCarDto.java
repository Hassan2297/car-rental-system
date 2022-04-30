package com.example.carerentalsystem.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

/**
 * @author Hassan Wael
 */
public class RentCarDto {

    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String carBrand;

    @NotEmpty
    private String carModel;

    @NotEmpty
    private String color;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fromDay;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate toDay;

    @NotEmpty
    private String pickupLocation;

    public RentCarDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFromDay() {
        return fromDay;
    }

    public void setFromDay(LocalDate fromDay) {
        this.fromDay = fromDay;
    }

    public LocalDate getToDay() {
        return toDay;
    }

    public void setToDay(LocalDate toDay) {
        this.toDay = toDay;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    @Override
    public String toString() {
        return "RentCarDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", fromDay=" + fromDay +
                ", toDay=" + toDay +
                ", pickupLocation='" + pickupLocation + '\'' +
                '}';
    }
}
