package ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.controllers;

import ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.models.Product;
import ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.services.ProductServicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductControllers {
    public static void displayMenu() {
        ProductServicesImpl productServices = new ProductServicesImpl();
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("==========PRODUCT MANAGEMENT SYSTEM==========\n" +
                    "1.\tCreate\n" +
                    "2.\tDisplay\n" +
                    "3.\tSearch\n" +
                    "4.\tExit\n" +
                    " (Please choose 1 to Create Product, 2 to Display Product, " +
                    "3 to Search Product and 4 to Exit program).\n");
            System.out.println("Enter choose");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productServices.create();
                    break;
                case 2:
                    System.out.println("==========DISPLAY PRODUCT LIST==========");
                    productServices.display();
                    break;
                case 3:
                    System.out.println("==========SEARCH PRODUCT==========");
                    System.out.println("Enter name need search");
                    String nameSearch = scanner.nextLine();
                    productServices.search(nameSearch);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }
}
