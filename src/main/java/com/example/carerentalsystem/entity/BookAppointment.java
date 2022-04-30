package com.example.carerentalsystem.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Hassan Wael
 */
@Entity
@Table(name = BookAppointment.TABLE_NAME)
public class BookAppointment {

    static final String TABLE_NAME = "Book_Appointment";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "BOOK_CREATED_DATE")
    private LocalDate bookCreatedDate;

    private LocalDate bookAppointmentDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public BookAppointment() {
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
        return "BookAppointment{" +
                "id=" + id +
                ", bookCreatedDate=" + bookCreatedDate +
                ", bookAppointmentDate=" + bookAppointmentDate +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
