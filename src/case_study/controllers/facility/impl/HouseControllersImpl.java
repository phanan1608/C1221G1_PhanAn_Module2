package case_study.controllers.facility.impl;

import case_study.controllers.facility.IHouseControllers;
import case_study.models.facility.House;
import case_study.services.facility.IRoomService;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class HouseControllersImpl extends FacilityControllerImpl implements IHouseControllers {
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public Object inputInformation() {
        super.inputFacilityInformationBasic();
        String serviceId = getServiceIdFromInput();
        String roomStandard = getRoomStandardFromInput();
        int numberOfFloors = getNumberOfFloorsFromInput();
        return new House(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, numberOfFloors);
    }

    public String getServiceIdFromInput() {
        String serviceId;
        do {
            System.out.println("Enter House ID");
            serviceId = scanner.nextLine();
            if (!Validate.isHouseId(serviceId)) {
                System.out.println("Invalid House ID. Please Re-enter(SVH0-XXXX X:number))!!!");
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
