package com.example.carerentalsystem.dto;

import com.example.carerentalsystem.enums.TransmissionType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Hassan Wael
 */
public class SellCarDto {

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

    @NotNull
    private Double price;

    @NotEmpty
    private String transmissionType;

    public SellCarDto() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "SellCarDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", transmissionType='" + transmissionType + '\'' +
                '}';
    }
}
