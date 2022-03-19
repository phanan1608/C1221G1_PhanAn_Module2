package case_study.controllers.facility;

import case_study.models.facility.House;
import case_study.services.facility.IRoomService;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class HouseControllersImpl extends FacilityControllerImpl {
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public Object inputInformation() {
        super.inputFacilityInformationBasic();
        String serviceId = getServiceIdFromInput();
        String roomStandard = getRoomStandardFromInput();
        int numberOfFloors = getNumberOfFloorsFromInput();
        return new House(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, numberOfFloors);
    }

    public String getServiceIdFromInput() {
        System.out.print("Enter Service Id: ");
        return Validate.regexHouseId(scanner.nextLine(),
                "Invalid House ID. Please Re-enter(SVH0-XXXX X:number))!!!");
    }

    public String getRoomStandardFromInput() {
        System.out.print("Enter Room Standard: ");
        return Validate.regexStandardName(scanner.nextLine(),
                "Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
    }


    protected Integer getNumberOfFloorsFromInput() {
        System.out.print("Enter Number Of Floors: ");
        return Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number Of Floors. Please Re-enter(Position Integer)!!!"));
    }

}
