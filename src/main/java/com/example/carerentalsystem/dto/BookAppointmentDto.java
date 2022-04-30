package com.example.carerentalsystem.dto;

import com.example.carerentalsystem.entity.Car;
import com.example.carerentalsystem.entity.User;

import java.time.LocalDate;

/**
 * @author Hassan Wael
 */
public class BookAppointmentDto {

    private long id;

    private LocalDate bookCreatedDate;

    private LocalDate bookAppointmentDate;

    private String email;

    private Car car;

    public BookAppointmentDto() {
    }

    public BookAppointmentDto(long id, LocalDate bookCreatedDate, LocalDate bookAppointmentDate, String email, Car car) {
        this.id = id;
        this.bookCreatedDate = bookCreatedDate;
        this.bookAppointmentDate = bookAppointmentDate;
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

    public LocalDate getBookAppointmentDate() {
        return bookAppointmentDate;
    }

    public void setBookAppointmentDate(LocalDate bookAppointmentDate) {
        this.bookAppointmentDate = bookAppointmentDate;
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
        return "BookAppointmentDto{" +
                "id=" + id +
                ", bookCreatedDate=" + bookCreatedDate +
                ", bookAppointmentDate=" + bookAppointmentDate +
                ", email=" + email +
                ", car=" + car +
                '}';
    }
}
