package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    // constructor that accepts parameters representing the make, model, colour and
    // year of the car
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for colour
    public String getColour() {
        return colour;
    }

    // Setter for colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Method to get details
    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Colour: " + colour;
    }

}
