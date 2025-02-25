package com.using.hashmap.controller;
import com.using.hashmap.exception.CustomerException;
import com.using.hashmap.model.Customer;
import com.using.hashmap.service.CustomerService;
import java.util.Scanner;

public class CustomerController {

    private CustomerService customerService = new CustomerService();
    private Customer C = new Customer();
    private Scanner sc = new Scanner(System.in);

    public void data() {
        int option;
        do{
            System.out.println("\n---- Customer ----");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer Details");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");

            option = Integer.parseInt(sc.nextLine());
            try {
                switch (option) {
                    case 1:
                        customerService.createCustomer();
                        Customer customer = new Customer();
                        customerService.displayCustomers();
                        System.out.println("Customer created : " + customer);
                        break;
                    case 2:
                        customerService.createCustomer();
                        break;
                    case 0:
                        System.out.println("Returning to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (CustomerException e) {
                System.out.println("Error: " + e.getClass());
            }
        } while (option != 0);
    }
}