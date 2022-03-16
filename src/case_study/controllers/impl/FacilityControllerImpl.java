package case_study.controllers.impl;

import case_study.utils.Validate;

import java.util.Scanner;

public class FacilityControllerImpl {
    protected String nameService;
    protected double usableArea;
    protected double rentCost;
    protected int maximumPeopleNumber;
    protected String rentType;

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
            if (!Validate.isInput(nameService)) {
                System.err.println("Invalid Name Service. Please Re-enter!!!");
            } else break;
        } while (true);
        return nameService;
    }

    protected Double getUsableAreaFromInput() {
        String usableArea;
        do {
            System.out.println("Enter Name Service");
            usableArea = scanner.nextLine();
            if (!Validate.isPositiveDouble(usableArea)) {
                System.err.println("Invalid Usable Area. Please Re-enter!!!");
            } else break;
        } while (true);
        return Double.parseDouble(usableArea);
    }

    protected Double getRentCostFromInput() {
        String rentCost;
        do {
            System.out.println("Enter Name Service");
            rentCost = scanner.nextLine();
            if (!Validate.isPositiveDouble(rentCost)) {
                System.err.println("Invalid Rent Cost. Please Re-enter!!!");
            } else break;
        } while (true);
        return Double.parseDouble(rentCost);
    }

    protected Integer getMaximumPeopleFromInput() {
        String maximumPeople;
        do {
            System.out.println("Enter Maximum People");
            maximumPeople = scanner.nextLine();
            if (!Validate.isPositiveInteger(maximumPeople)) {
                System.err.println("Invalid Maximum People. Please Re-enter!!!");
            } else break;
        } while (true);
        return Integer.parseInt(maximumPeople);
    }

    protected String getRentTypeFromInput() {
        String rentType;
        do {
            System.out.println("Enter Rent Type");
            rentType = scanner.nextLine();
            if (!Validate.isInput(rentType)) {
                System.err.println("Invalid Rent Type. Please Re-enter!!!");
            } else break;
        } while (true);
        return rentType;
    }

}
