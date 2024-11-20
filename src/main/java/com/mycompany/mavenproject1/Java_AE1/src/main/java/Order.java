/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashik
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Book> books;
    private List<Accessory> accessories;
    private double totalAmount;

    public Order() {
        this.books = new ArrayList<>();
        this.accessories = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addBook(Book book) {
        books.add(book);
        totalAmount += book.getPrice();
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
        totalAmount += accessory.getPrice();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order Details:\n");
        for (Book book : books) {
            orderDetails.append(book.toString()).append("\n");
        }
        for (Accessory accessory : accessories) {
            orderDetails.append(accessory.toString()).append("\n");
        }
        orderDetails.append("Total Amount: $").append(totalAmount);
        return orderDetails.toString();
    }
}
