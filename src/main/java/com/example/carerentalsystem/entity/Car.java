package com.example.carerentalsystem.entity;

import com.example.carerentalsystem.enums.CarType;
import com.example.carerentalsystem.enums.TransmissionType;

import javax.persistence.*;

/**
 * @author Hassan Wael
 */
@Entity
@Table(name = Car.TABLE_NAME)
public class Car {

    static final String TABLE_NAME = "CAR";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CAR_BRAND")
    private String carBrand;

    @Column(name = "CAR_MODEL")
    private String carModel;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "STOCK")
    private Integer stock;

    @Column(name = "COLOR")
    private String color;

    @Enumerated(EnumType.STRING)
    @Column(name = "CAR_TYPE")
    private CarType carType;

    @Enumerated(EnumType.STRING)
    @Column(name = "TRANSMISSION_TYPE")
    private TransmissionType transmissionType;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType userType) {
        this.carType = userType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", color='" + color + '\'' +
                ", carType=" + carType +
                ", transmissionType=" + transmissionType +
                ", category=" + category +
                '}';
    }
}
