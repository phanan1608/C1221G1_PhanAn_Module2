package case_study.controllers.facility;

import case_study.models.facility.House;
import case_study.services.facility.IHouseService;
import case_study.services.facility.impl.HouseServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class HouseController extends FacilityController {
    IHouseService houseService = new HouseServiceImpl();
    Scanner scanner = new Scanner(System.in);
    String serviceId;

    public void displayHouseList() {
        houseService.displayList();
    }

    public void addHouse() {
        super.inputFacilityInformationBasic();
        System.out.print("Enter Service Id: ");
        String serviceId = Validate.regexHouseId(scanner.nextLine(),
                "Invalid House ID. Please Re-enter(SVH0-XXXX X:number))!!!");
        System.out.print("Enter Room Standard: ");
        String roomStandard = Validate.regexStandardName(scanner.nextLine(),
                "Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
        System.out.print("Enter Number Of Floors: ");
        int numberOfFloors = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number Of Floors. Please Re-enter(Position Integer)!!!"));
        House house = new House(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, numberOfFloors);
        houseService.add(house);
        System.out.println(house);
        System.out.println("House created successfully!!!");
    }

    public House inputInformation() {
        super.inputFacilityInformationBasic();
        System.out.print("Enter Service Id: ");
        String serviceId = Validate.regexHouseId(scanner.nextLine(),
                "Invalid House ID. Please Re-enter(SVH0-XXXX X:number))!!!");
        System.out.print("Enter Room Standard: ");
        String roomStandard = Validate.regexStandardName(scanner.nextLine(),
                "Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
        System.out.print("Enter Number Of Floors: ");
        int numberOfFloors = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number Of Floors. Please Re-enter(Position Integer)!!!"));
        return new House(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, numberOfFloors);
    }

}
