package com.paolabs.lab4.ex4;

public class TestSale {

    public static void main(String[] args) {

        Sale sale = new Sale(2);
        sale.addArticle("mouse", 120, 1);
        sale.addArticle("mousePad", 23, 2);
        System.out.println(sale.computeTotal());

    }
}
