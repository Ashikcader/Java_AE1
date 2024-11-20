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
import java.util.Scanner;

public class BookStore {
    private List<Book> books;
    private List<Accessory> accessories;
    private User currentUser;

    public BookStore(User user) {
        this.currentUser = user;
        this.books = new ArrayList<>();
        this.accessories = new ArrayList<>();
        initializeData();
    }

    private void initializeData() {
        books.add(new Book("Java Basics", "John Doe", 29.99));
        books.add(new Book("Advanced Java", "Jane Smith", 39.99));
        accessories.add(new Accessory("Bookmark", 2.99));
        accessories.add(new Accessory("Notebook", 5.99));
    }

    public void searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(keyword) || book.getAuthor().equalsIgnoreCase(keyword)) {
                System.out.println(book);
            }
        }
    }

    public void buyItems() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        String choice;
        
        System.out.println("Enter 'book' to buy a book or 'accessory' to buy an accessory:");
        while (!(choice = scanner.nextLine()).equalsIgnoreCase("done")) {
            if (choice.equalsIgnoreCase("book")) {
                System.out.println("Enter book title:");
                String title = scanner.nextLine();
                Book book = findBookByTitle(title);
                if (book != null) {
                    order.addBook(book);
                    book.incrementSales();
                    System.out.println("Added to order: " + book);
                } else {
                    System.out.println("Book not found.");
                }
            } else if (choice.equalsIgnoreCase("accessory")) {
                System.out.println("Enter accessory name:");
                String name = scanner.nextLine();
                Accessory accessory = findAccessoryByName(name);
                if (accessory != null) {
                    order.addAccessory(accessory);
                    accessory.incrementSales();
                    System.out.println("Added to order: " + accessory);
                } else {
                    System.out.println("Accessory not found.");
                }
            } else {
                System.out.println("Invalid choice. Enter 'book', 'accessory', or 'done' to finish.");
            }
            System.out.println("Add more items or type 'done' to finish:");
        }
        currentUser.addOrder(order);
        System.out.println("Order placed successfully! Total: $" + order.getTotalAmount());
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    private Accessory findAccessoryByName(String name) {
        for (Accessory accessory : accessories) {
            if (accessory.getName().equalsIgnoreCase(name)) {
                return accessory;
            }
        }
        return null;
    }

    public void viewOrderHistory() {
        List<Order> orders = currentUser.getOrderHistory();
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }
}
