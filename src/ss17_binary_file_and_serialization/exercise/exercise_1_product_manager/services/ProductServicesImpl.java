package ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.services;

import ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.models.Product;
import ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductServicesImpl implements IService {
    static List<Product> productList = new ArrayList<>();

    static {
        productList = ReadAndWriteFile.readProDuctFile();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void create() {
        System.out.println("==========CREATE PRODUCT==========");
        System.out.println("Enter Product ID");
        String productId = scanner.nextLine();
        System.out.println("Enter Product Name");
        String productName = scanner.nextLine();
        System.out.println("Enter Manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter Price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Product Description");
        String description = scanner.nextLine();
        Product product = new Product(productId, productName, manufacturer, price, description);
//        productList = ReadAndWriteFile.readProDuctFile();
        productList.add(product);
        ReadAndWriteFile.writeProductFile(productList);
    }

    @Override
    public void display() {
//        productList = ReadAndWriteFile.readProDuctFile();
        for (Product element : productList) {
            System.out.println(element);
        }
    }

    @Override
    public void search(String nameSearch) {
//        productList = ReadAndWriteFile.readProDuctFile();
        List<Product> listSameName = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductName().toLowerCase().contains(nameSearch.toLowerCase())) {
                listSameName.add(product);
            }
        }
        if (listSameName.size() != 0) {
            for (Product product : listSameName) {
                System.out.println(product);
            }
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
