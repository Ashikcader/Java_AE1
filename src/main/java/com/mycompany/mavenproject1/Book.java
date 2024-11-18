/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashik
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private int sales;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
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
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }
}
