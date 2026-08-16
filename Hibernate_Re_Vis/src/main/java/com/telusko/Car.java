package com.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "car_table")
public class Car {
    @Id
    @Column(name = "car_id")
    private int carId;
    @Column(name = "car_name")
    private String carName;
    @Column(name = "car_type")
    private String carType;
    @Transient
    @Column(name = "car_price")
    private double carPrice;
    @ManyToOne
    private User user;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
