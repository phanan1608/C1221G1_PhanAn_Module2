package ss12_java_collection_framework.exercise.exercise_1_arraylist_linkedlist_in_java_collection;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Product product1 = new Product(1, "A", 10, 123);
//        Product product2 = new Product(2, "B", 15, 12);
//        Product product3 = new Product(3, "C", 14, 12333);

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. ADD PRODUCT ");
            System.out.println("2. EDIT PRODUCT");
            System.out.println("3. DELETE PRODUCT");
            System.out.println("4. DISPLAY PRODUCT");
            System.out.println("5. SEARCH PRODUCT");
            System.out.println("6. SORT PRODUCT");
            System.out.println("7. EXIT");
            System.out.println("Enter your function: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("ADD PRODUCT");
                    ProductManager.addProduct();
                    break;
                case 2:
                    System.out.println("EDIT PRODUCT");
                    ProductManager.editProduct();
                    break;
                case 3:
                    System.out.println("DELETE PRODUCT");
                    ProductManager.deleteProduct();
                    break;
                case 4:
                    System.out.println("DISPLAY PRODUCT");
                    ProductManager.displayProduct();
                    break;
                case 5:
                    System.out.println("SEARCH PRODUCT");
                    ProductManager.searchByName();
                    break;
                case 6:
                    System.out.println("SORT PRODUCT");
                    ProductManager.sortProduct();
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("No choice!");
            }

        } while (true);
    }
}