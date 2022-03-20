package case_study.controllers.facility;

import case_study.models.facility.Villa;
import case_study.services.facility.IVillaService;
import case_study.services.facility.impl.VillaServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class VillaController extends FacilityController {
    IVillaService villaService = new VillaServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void displayVillaList() {
        villaService.displayList();
    }

    public void addVilla() {
        super.inputFacilityInformationBasic();
        System.out.print("Enter Service Id: ");
        String serviceId = Validate.regexVillaId(scanner.nextLine(),
                "Invalid Villa ID. Please Re-enter(SVVL-XXXX X:number))!!!");
        System.out.print("Enter Room Standard: ");
        String roomStandard = Validate.regexStandardName(scanner.nextLine(),
                "Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
        System.out.print("Enter Pool Area: ");
        double poolArea = Double.parseDouble(Validate.regexArea(scanner.nextLine(),
                "Invalid Pool Area. Please Re-enter(Position Double)!!!"));
        System.out.print("Enter Number Of Floors: ");
        int numberOfFloors = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number Of Floors. Please Re-enter(Position Integer)!!!"));
        Villa villa = new Villa(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, poolArea, numberOfFloors);
        villaService.add(villa);
        System.out.println(villa);
        System.out.println("Villa created successfully!!!");
    }

    public Villa inputInformation() {
        super.inputFacilityInformationBasic();
        System.out.print("Enter Service Id: ");
        String serviceId = Validate.regexVillaId(scanner.nextLine(),
                "Invalid Villa ID. Please Re-enter(SVVL-XXXX X:number))!!!");
        System.out.print("Enter Room Standard: ");
        String roomStandard = Validate.regexStandardName(scanner.nextLine(),
                "Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
        System.out.print("Enter Pool Area: ");
        double poolArea = Double.parseDouble(Validate.regexArea(scanner.nextLine(),
                "Invalid Pool Area. Please Re-enter(Position Double)!!!"));
        System.out.print("Enter Number Of Floors: ");
        int numberOfFloors = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number Of Floors. Please Re-enter(Position Integer)!!!"));
        return new Villa(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, poolArea, numberOfFloors);
    }
}
