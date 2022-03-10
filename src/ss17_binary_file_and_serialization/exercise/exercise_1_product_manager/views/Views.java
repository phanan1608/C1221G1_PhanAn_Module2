package ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.views;

import ss17_binary_file_and_serialization.exercise.exercise_1_product_manager.controllers.ProductControllers;

public class Views {
    public static void main(String[] args) {
        ProductControllers productControllers = new ProductControllers();
        productControllers.displayMenu();
    }
}
