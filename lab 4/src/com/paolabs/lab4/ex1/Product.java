package com.paolabs.lab4.ex1;

public class Product {

    private String name;
    private String code;
    private double price;
    private double sellingPrice;

    public Product() {
    }

    public double computePrice(int noOfItems) {
        return sellingPrice * noOfItems;
    }

    public double computePrice(int noOfItems, double discount) {
        sellingPrice -= (sellingPrice * discount) / 100;
        return sellingPrice * noOfItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
