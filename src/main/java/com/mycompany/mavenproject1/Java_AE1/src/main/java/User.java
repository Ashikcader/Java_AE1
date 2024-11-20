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

public class User {
    private String name;
    private List<Order> orderHistory;

    public User(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    @Override
    public String toString() {
        return "User: " + name;
    }
}
