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
        System.out.print("Enter Name Service: ");
        return Validate.regexStandardName(scanner.nextLine(), "Invalid Name Service. " +
                "Please Re-enter(Upper first letter)!!!");
    }

    protected Double getUsableAreaFromInput() {
        System.out.print("Enter Usable Area: ");
        return Double.parseDouble(Validate.regexArea(scanner.nextLine(),
                "Invalid Usable Area. Please Re-enter(number>=30)!!!"));
    }

    protected Double getRentCostFromInput() {
        System.out.print("Enter Rent Cost: ");
        return Double.parseDouble(Validate.regexPositiveDouble(scanner.nextLine(),
                "Invalid Rent Cost. Please Re-enter(Position Double)!!!"));
    }

    protected Integer getMaximumPeopleFromInput() {
        System.out.println("Enter Maximum People: ");
        return Integer.parseInt(Validate.regexMaximumPeople(scanner.nextLine(), "Invalid Maximum People. Please Re-enter(from 1 to 19)!!!"));
    }

    protected RentType getRentTypeFromInput() {
        int choice;
        do {
            int i = 1;
            System.out.println("Enter Rent Type: ");
            for (RentType rentType : RentType.values()) {
                System.out.printf("%d.%s", i++, rentType + "\n");
            }
            choice = InputData.inputIntegerChoice();
            if (choice < 1 || choice > RentType.values().length) {
                System.out.println("Please choice from 1 to " + RentType.values().length);
            } else break;
        } while (true);
        return RentType.values()[choice - 1];
    }
}
