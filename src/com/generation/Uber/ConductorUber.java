package com.generation.Uber;

public class ConductorUber {

    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    int ratePerKm = 4;
    private int ratePerMinute = 1;

    public int getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(int ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    private int currentMonthSalary = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public void setRatePerMinute(int ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public int getCurrentMonthSalary() {
        return currentMonthSalary;
    }

    public void setCurrentMonthSalary(int currentMonthSalary) {
        this.currentMonthSalary = currentMonthSalary;
    }

    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,7);
    }
}
