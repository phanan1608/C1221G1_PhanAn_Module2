package ss12_java_collection_framework.exercise.excercise_1_arraylist_linkedlist_in_java_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> listProduct = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        listProduct.add(new Product(1, "A", 15, 1231));
        listProduct.add(new Product(2, "B", 25, 1235));
        listProduct.add(new Product(3, "C", 35, 1232));
        listProduct.add(new Product(4, "D", 5, 1234));
    }

    public static void addProduct() {
        System.out.println("Add Product");
        System.out.println("Enter ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Amount");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Price");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, amount, price);
        listProduct.add(product);
    }

    public static void editProduct() {
        System.out.println("Enter ID need delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == idDelete) {
                System.out.println("Enter name need edit ");
                String name = scanner.nextLine();
                listProduct.get(i).setName(name);
                System.out.println("Enter amount need edit ");
                int amountEdit = Integer.parseInt(scanner.nextLine());
                listProduct.get(i).setAmount(amountEdit);
                System.out.println("Enter price need edit ");
                double priceEdit = Double.parseDouble(scanner.nextLine());
                listProduct.get(i).setPrice(priceEdit);
            }
        }

    }

    public static void deleteProduct() {
        System.out.println("Enter ID product need delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == idDelete) {
                listProduct.remove(listProduct.get(i));
            }
        }
    }

    public static void displayProduct() {
        for (Product element : listProduct) {
            System.out.println(element);
        }
    }

    public static void searchByName() {
        System.out.println("Enter Name product need search");
        String nameSearch = scanner.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if (nameSearch.equals(listProduct.get(i).getName())) {
                System.out.println(listProduct.get(i).toString());
            }
        }
    }

    public static void sortProduct() {
        System.out.println("1.Sort up");
        System.out.println("2.Sort down");

        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            System.out.println("SORT UP");
            listProduct.sort(new SortUp());
        } else if (choice == 2) {
            System.out.println("SORT DOWN");
            listProduct.sort(new SortDown());
        }
        displayProduct();

    }

}
