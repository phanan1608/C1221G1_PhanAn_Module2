package case_study.controllers.facility;

import case_study.models.facility.Villa;
import case_study.services.facility.IRoomService;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class VillaControllersImpl extends FacilityControllerImpl {
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public Object inputInformation() {
        super.inputFacilityInformationBasic();
        String serviceId = getServiceIdFromInput();
        String roomStandard = getRoomStandardFromInput();
        double poolArea = getPoolAreaFromInput();
        int numberOfFloors = getNumberOfFloorsFromInput();
        return new Villa(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, poolArea, numberOfFloors);
    }

    public String getServiceIdFromInput() {
        System.out.print("Enter Service Id: ");
        return Validate.regexVillaId(scanner.nextLine(),
                "Invalid Villa ID. Please Re-enter(SVVL-XXXX X:number))!!!");
    }

    public String getRoomStandardFromInput() {
        System.out.print("Enter Room Standard: ");
        return Validate.regexStandardName(scanner.nextLine(),
                "Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
    }


    protected Double getPoolAreaFromInput() {
        System.out.print("Enter Pool Area: ");
        return Double.parseDouble(Validate.regexArea(scanner.nextLine(),
                "Invalid Pool Area. Please Re-enter(Position Double)!!!"));
    }

    protected Integer getNumberOfFloorsFromInput() {
        System.out.print("Enter Number Of Floors: ");
        return Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number Of Floors. Please Re-enter(Position Integer)!!!"));
    }
}
