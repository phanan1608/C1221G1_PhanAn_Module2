package case_study.controllers.facility.impl;

import case_study.controllers.facility.IRoomControllers;
import case_study.models.facility.Room;
import case_study.services.facility.IRoomService;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class RoomControllersImpl extends FacilityControllerImpl implements IRoomControllers {
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public Object inputInformation() {
        super.inputFacilityInformationBasic();
        String freeService = getFreeServiceFromInput();
        return new Room(nameService, usableArea, rentCost, maximumPeopleNumber, rentType, freeService);
    }

    public String getFreeServiceFromInput() {
        String freeService;
        do {
            System.out.println("Enter Free Service");
            freeService = scanner.nextLine();
            if (!Validate.isInput(freeService)) {
                System.err.println("Invalid Free Service!!!");
            } else break;
        } while (true);
        return freeService;
    }

}
