package case_study.controllers.facility.impl;

import case_study.controllers.facility.IVillaControllers;
import case_study.models.facility.Villa;
import case_study.services.facility.IRoomService;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class VillaControllersImpl extends FacilityControllerImpl implements IVillaControllers {
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public Object inputInformation() {
        super.inputFacilityInformationBasic();
        String serviceId = getServiceIdFromInput();
        String roomStandard = getRoomStandardFromInput();
        double poolArea = getPoolAreaFromInput();
        int numberOfFloors = getNumberOfFloorsFromInput();
        return new Villa(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, poolArea, numberOfFloors);
    }

    public String getServiceIdFromInput() {
        String serviceId;
        do {
            System.out.println("Enter Room ID");
            serviceId = scanner.nextLine();
            if (!Validate.isVillaId(serviceId)) {
                System.out.println("Invalid Villa ID. Please Re-enter(SVVL-XXXX X:number))!!!");
            } else break;
        } while (true);
        return serviceId;
    }

    public String getRoomStandardFromInput() {
        String roomStandard;
        do {
            System.out.println("Enter Room Standard");
            roomStandard = scanner.nextLine();
            if (!Validate.isStandardName(roomStandard)) {
                System.out.println("Invalid Room Standard. Please Re-enter(Upper first letter)!!!");
            } else break;
        } while (true);
        return roomStandard;
    }


    protected Double getPoolAreaFromInput() {
        String poolArea;
        do {
            System.out.println("Enter Pool Area");
            poolArea = scanner.nextLine();
            if (!Validate.isArea(poolArea)) {
                System.out.println("Invalid Pool Area. Please Re-enter(Position Double)!!!");
            } else break;
        } while (true);
        return Double.parseDouble(poolArea);
    }

    protected Integer getNumberOfFloorsFromInput() {
        String numberOfFloors;
        do {
            System.out.println("Enter Number Of Floors");
            numberOfFloors = scanner.nextLine();
            if (!Validate.isPositiveInteger(numberOfFloors)) {
                System.out.println("Invalid Number Of Floors. Please Re-enter(Position Integer)!!!");
            } else break;
        } while (true);
        return Integer.parseInt(numberOfFloors);
    }
}
