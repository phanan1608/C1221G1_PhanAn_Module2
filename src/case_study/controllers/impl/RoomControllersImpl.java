package case_study.controllers.impl;

import case_study.controllers.IRoomControllers;
import case_study.models.Room;
import case_study.services.ICustomerService;
import case_study.services.impl.CustomerServiceImpl;
import case_study.utils.Validate;

import java.util.Scanner;

public class RoomControllersImpl extends FacilityControllerImpl implements IRoomControllers {
    ICustomerService customerService = new CustomerServiceImpl();
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
            if (!Validate.isEmployeeId(freeService)) {
                System.err.println("Invalid Free Service!!!");
            } else break;
        } while (true);
        return freeService;
    }
}
