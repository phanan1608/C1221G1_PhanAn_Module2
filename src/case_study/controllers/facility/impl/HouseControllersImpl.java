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
        String roomStandard = getRoomStandardFromInput();
        int numberOfFloors = getNumberOfFloorsFromInput();
        return new House(nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, numberOfFloors);
    }

    public String getRoomStandardFromInput() {
        String roomStandard;
        do {
            System.out.println("Enter Room Standard");
            roomStandard = scanner.nextLine();
            if (!Validate.isInput(roomStandard)) {
                System.err.println("Invalid Room Standard!!!");
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
                System.err.println("Invalid Number Of Floors. Please Re-enter(Position Integer)!!!");
            } else break;
        } while (true);
        return Integer.parseInt(numberOfFloors);
    }

}
