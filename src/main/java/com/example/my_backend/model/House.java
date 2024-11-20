package com.example.my_backend.model;

public class House {
    private String brokeredBy;
    private String status;
    private double price;
    private int bed;
    private int bath;
    private double acreLot;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private double houseSize;
    private String prevSoldDate;

    public House(String brokeredBy, String status, double price, int bed, int bath, double acreLot, String street, String city, String state, String zipCode, double houseSize, String prevSoldDate) {
        this.brokeredBy = brokeredBy;
        this.status = status;
        this.price = price;
        this.bed = bed;
        this.bath = bath;
        this.acreLot = acreLot;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.houseSize = houseSize;
        this.prevSoldDate = prevSoldDate;
    }


    public String getBrokeredBy() {
        return brokeredBy;
    }

    public void setBrokeredBy(String brokeredBy) {
        this.brokeredBy = brokeredBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public double getAcreLot() {
        return acreLot;
    }

    public void setAcreLot(double acreLot) {
        this.acreLot = acreLot;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(double houseSize) {
        this.houseSize = houseSize;
    }

    public String getPrevSoldDate() {
        return prevSoldDate;
    }

    public void setPrevSoldDate(String prevSoldDate) {
        this.prevSoldDate = prevSoldDate;
    }


    // Constructor, Getters, and Setters are omitted for brevity
}
