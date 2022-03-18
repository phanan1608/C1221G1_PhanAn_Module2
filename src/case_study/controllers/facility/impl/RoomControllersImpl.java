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
        String serviceId = getServiceIdFromInput();
        String freeService = getFreeServiceFromInput();
        return new Room(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, freeService);
    }

    public String getServiceIdFromInput() {
        System.out.print("Enter Service Id: ");
        return Validate.regexRoomId(scanner.nextLine(),
                "Invalid Room ID. Please Re-enter(SVRO-XXXX X:number))!!!");
    }

    public String getFreeServiceFromInput() {
        System.out.print("Enter Free Service: ");
        return Validate.regexInput(scanner.nextLine(), "Invalid Free Service!!!");
    }

}
