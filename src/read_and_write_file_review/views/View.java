package read_and_write_file_review.views;

import read_and_write_file_review.controllers.VehicleController;

public class View {
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        vehicleController.displayMenu();
    }
}
