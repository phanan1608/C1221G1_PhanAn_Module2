package case_study.controllers.facility.impl;

import case_study.models.enums.RentType;
import case_study.utils.InputData;
import case_study.utils.Validate;

import java.util.Scanner;

public class FacilityControllerImpl {
    protected String nameService;
    protected double usableArea;
    protected double rentCost;
    protected int maximumPeopleNumber;
    protected RentType rentType;

    Scanner scanner = new Scanner(System.in);

    protected void inputFacilityInformationBasic() {
        nameService = getNameServiceFromInput();
        usableArea = getUsableAreaFromInput();
        rentCost = getRentCostFromInput();
        maximumPeopleNumber = getMaximumPeopleFromInput();
        rentType = getRentTypeFromInput();
    }

    protected String getNameServiceFromInput() {
        String nameService;
        do {
            System.out.println("Enter Name Service");
            nameService = scanner.nextLine();
            if (!Validate.isStandardName(nameService)) {
                System.out.println("Invalid Name Service. Please Re-enter(Upper first letter)!!!");
            } else break;
        } while (true);
        return nameService;
    }

    protected Double getUsableAreaFromInput() {
        String usableArea;
        do {
            System.out.println("Enter Usable Area");
            usableArea = scanner.nextLine();
            if (!Validate.isArea(usableArea)) {
                System.out.println("Invalid Usable Area. Please Re-enter(number>=30)!!!");
            } else break;
        } while (true);
        return Double.parseDouble(usableArea);
    }

    protected Double getRentCostFromInput() {
        String rentCost;
        do {
            System.out.println("Enter Rent Cost");
            rentCost = scanner.nextLine();
            if (!Validate.isPositiveDouble(rentCost)) {
                System.out.println("Invalid Rent Cost. Please Re-enter(Position Double)!!!");
            } else break;
        } while (true);
        return Double.parseDouble(rentCost);
    }

    protected Integer getMaximumPeopleFromInput() {
        String maximumPeople;
        do {
            System.out.println("Enter Maximum People");
            maximumPeople = scanner.nextLine();
            if (!Validate.isMaximumPeople(maximumPeople)) {
                System.out.println("Invalid Maximum People. Please Re-enter(from 1 to 19)!!!");
            } else break;
        } while (true);
        return Integer.parseInt(maximumPeople);
    }

    protected RentType getRentTypeFromInput() {
        int choice;
        do {
            int i = 1;
            System.out.println("Enter Rent Type");
            for (RentType rentType : RentType.values()) {
                System.out.printf("%d.%s", i++, rentType + "\n");
            }
            choice = InputData.inputChoice();
            if (choice < 1 || choice > RentType.values().length) {
                System.out.println("Please choice from 1 to " + RentType.values().length);
            } else break;
        } while (true);
        return RentType.values()[choice - 1];
    }

//    protected void displayFacilityList(List<Facility> facilityList) {
//        if (facilityList.size() != 0) {
//            for (Facility facility : facilityList) {
//                System.out.println(facility);
//            }
//        } else {
//            System.out.println("List Empty");
//        }
//    }

}
