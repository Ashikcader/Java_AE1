/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashik
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice");
        BookStore bookStore = new BookStore(user);
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to BookNook! Type 'search', 'buy', or 'history' to proceed. Type 'exit' to quit.");

        while (!(command = scanner.nextLine()).equalsIgnoreCase("exit")) {
            switch (command.toLowerCase()) {
                case "search":
                    System.out.println("Enter book title or author:");
                    String keyword = scanner.nextLine();
                    bookStore.searchBook(keyword);
                    break;
                case "buy":
                    bookStore.buyItems();
                    break;
                case "history":
                    bookStore.viewOrderHistory();
                    break;
                default:
                    System.out.println("Unknown command. Try 'search', 'buy', 'history', or 'exit'.");
            }
            System.out.println("\nWhat would you like to do next?");
        }

        System.out.println("Thank you for visiting BookNook!");
    }
}
