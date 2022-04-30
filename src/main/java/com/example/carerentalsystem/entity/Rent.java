package com.example.carerentalsystem.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Hassan Wael
 */
@Entity
@Table(name = Rent.TABLE_NAME)
public class Rent {

    static final String TABLE_NAME = "RENT";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "BOOK_CREATED_DATE")
    private LocalDate bookCreatedDate;

    @Column(name = "RENT_FROM_DATE")
    private LocalDate rentFromDate;

    @Column(name = "RENT_TO_DATE")
    private LocalDate rentToDate;

    @Column(name = "PICUP_LOCATION")
    private String pickupLocation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Rent() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", bookCreatedDate=" + bookCreatedDate +
                ", rentFromDate=" + rentFromDate +
                ", rentToDate=" + rentToDate +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
