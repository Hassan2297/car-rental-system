package com.example.carerentalsystem.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Hassan Wael
 */
@Entity
@Table(name = User.TABLE_NAME)
public class User {
    static final String TABLE_NAME = "`USER`";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "Name")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "MOBILE_NUMBER", unique = true)
    private String mobileNumber;

    @Column(name = "ENABLED")
    private Boolean enabled;

    @Column(name = "LOGGED_IN")
    private Boolean loggedIn;

    @Column(name = "ADDRESS")
    private String address;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", enabled=" + enabled +
                ", loggedIn=" + loggedIn +
                ", address='" + address + '\'' +
                '}';
    }
}
