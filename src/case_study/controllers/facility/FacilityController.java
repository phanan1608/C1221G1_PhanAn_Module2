package case_study.controllers.facility;

import case_study.models.enums.RentType;
import case_study.utils.InputData;
import case_study.utils.Validate;

import java.util.Scanner;

public class FacilityController {
    protected String nameService;
    protected double usableArea;
    protected double rentCost;
    protected int maximumPeopleNumber;
    protected RentType rentType;

    Scanner scanner = new Scanner(System.in);

    protected void inputFacilityInformationBasic() {
        System.out.print("Enter Name Service: ");
        nameService = Validate.regexStandardName(scanner.nextLine(), "Invalid Name Service. " +
                "Please Re-enter(Upper first letter)!!!");
        System.out.print("Enter Usable Area: ");
        usableArea = Double.parseDouble(Validate.regexArea(scanner.nextLine(),
                "Invalid Usable Area. Please Re-enter(number>=30)!!!"));
        System.out.print("Enter Rent Cost: ");
        rentCost = Double.parseDouble(Validate.regexPositiveDouble(scanner.nextLine(),
                "Invalid Rent Cost. Please Re-enter(Position Double)!!!"));
        System.out.println("Enter Maximum People: ");
        maximumPeopleNumber = Integer.parseInt(Validate.regexMaximumPeople(scanner.nextLine(),
                "Invalid Maximum People. Please Re-enter(from 1 to 19)!!!"));
        rentType = getRentTypeFromInput();
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
