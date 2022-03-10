package ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.models;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private String manufacturer;
    private double price;
    private String description;

    public Product(String productId, String productName, String manufacturer, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
