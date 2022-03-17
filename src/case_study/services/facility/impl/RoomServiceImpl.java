package case_study.services.facility.impl;

import case_study.models.enums.RentType;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.services.facility.IRoomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl extends FacilityServiceImpl implements IRoomService {
    static List<Facility> roomList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        roomList.add(new Room("SVRO-1233", "Room1", 60, 1500000, 2,
                RentType.DAY, "buffet"));
        roomList.add(new Room("SVRO-3213", "Room2", 80, 2000000, 3,
                RentType.DAY, "buffet, taxi"));
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        roomList.add((Room) object);
        System.out.println("Successfully Added");
        displayList();
    }

    @Override
    public void displayList() {
        if (roomList.size() != 0) {
            for (Facility room : roomList) {
                System.out.println(room);
            }
        } else {
            System.err.println("List Empty");
        }
    }
}
