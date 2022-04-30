package com.example.carerentalsystem.dto;

import javax.validation.constraints.NotEmpty;

/**
 * @author Hassan Wael
 */
public class BuyCarDto {

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

    public BuyCarDto() {
    }

    public BuyCarDto(@NotEmpty String name, @NotEmpty String email, @NotEmpty String carBrand, @NotEmpty String color) {
        this.name = name;
        this.email = email;
        this.carBrand = carBrand;
        this.color = color;
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

    @Override
    public String toString() {
        return "BuyCarDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
