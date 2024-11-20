/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashik
 */
public class Accessory {
    private String name;
    private double price;
    private int sales;

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
        this.sales = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSales() {
        return sales;
    }

    public void incrementSales() {
        this.sales++;
    }

    @Override
    public String toString() {
        return "Accessory: " + name + ", Price: $" + price;
    }
}
