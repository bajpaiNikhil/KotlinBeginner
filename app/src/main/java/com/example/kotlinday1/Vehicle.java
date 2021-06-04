package com.capgemini.kotlinproject;

class Vehicle {
    int speed;
    String make;

    public Vehicle(int speed, String make) {
        this.speed = speed;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", make='" + make + '\'' +
                '}';
    }
}
