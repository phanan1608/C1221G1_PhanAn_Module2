package ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.utils;

import ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static final String PRODUCT_DATA_DAT = "src\\ss17_binary_file_and_serialization\\exercise\\exercise_1_product_manager\\data\\ProductData.dat";

    public static List<Product> readProDuctFile() {
        List<Product> productList = new ArrayList<>();
        File file = new File(PRODUCT_DATA_DAT);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() != 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {

                if (fileInputStream != null) {
                    fileInputStream.close();
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public static void writeProductFile(List<Product> productList) {
        File file = new File(PRODUCT_DATA_DAT);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
