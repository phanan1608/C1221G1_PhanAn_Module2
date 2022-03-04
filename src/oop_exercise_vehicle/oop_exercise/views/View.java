package oop_exercise_vehicle.oop_exercise.views;

import oop_exercise_vehicle.oop_exercise.controllers.VehicleController;

public class View {
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        vehicleController.displayMenu();
    }
}
