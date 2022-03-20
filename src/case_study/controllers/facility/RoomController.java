package case_study.controllers.facility;

import case_study.models.facility.Room;
import case_study.services.facility.IRoomService;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class RoomController extends FacilityController {
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void displayRoomList() {
        roomService.displayList();
    }

    public void addRoom() {
        super.inputFacilityInformationBasic();
        System.out.print("Enter Service Id: ");
        String serviceId = Validate.regexRoomId(scanner.nextLine(),
                "Invalid Room ID. Please Re-enter(SVRO-XXXX X:number))!!!");
        System.out.print("Enter Free Service: ");
        String freeService = Validate.regexInput(scanner.nextLine(), "Invalid Free Service!!!");
        Room room = new Room(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, freeService);
        roomService.add(room);
        System.out.println(room);
        System.out.println("Room created successfully!!!");
    }

    public Room inputInformation() {
        super.inputFacilityInformationBasic();
        String serviceId = Validate.regexRoomId(scanner.nextLine(),
                "Invalid Room ID. Please Re-enter(SVRO-XXXX X:number))!!!");
        System.out.print("Enter Free Service: ");
        String freeService = Validate.regexInput(scanner.nextLine(), "Invalid Free Service!!!");
        return new Room(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType, freeService);
    }
}
