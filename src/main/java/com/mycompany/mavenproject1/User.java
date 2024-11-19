/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria
 */
import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private String password; //Made mutable to allow password updates
    private final String role; //Changed from boolean to string for more flexibility (e.g., "admin", "user")
    private final List<Book> orderHistory = new ArrayList<>();

    // Constructor
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    // Add Order to History
    public void addOrder(Order order){
        if (order !=null) {
            orderHistory.add(order);
        }
    }

    //Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public List<Order> getOrderHistory() { return new ArrayList<>(orderHistory); } // Encapsulation

    // Password Setter
    public void setPassword(String password) { this.password = password; }
    
        
}
