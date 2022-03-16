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
        String roomStandard = getRoomStandardFromInput();
        double poolArea = getPoolAreaFromInput();
        int numberOfFloors = getNumberOfFloorsFromInput();
        return new Villa(nameService, usableArea, rentCost, maximumPeopleNumber, rentType, roomStandard, poolArea, numberOfFloors);
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


    protected Double getPoolAreaFromInput() {
        String poolArea;
        do {
            System.out.println("Enter Pool Area");
            poolArea = scanner.nextLine();
            if (!Validate.isPositiveDouble(poolArea)) {
                System.err.println("Invalid Pool Area. Please Re-enter(Position Double)!!!");
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
                System.err.println("Invalid Number Of Floors. Please Re-enter(Position Integer)!!!");
            } else break;
        } while (true);
        return Integer.parseInt(numberOfFloors);
    }

}
