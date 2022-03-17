package case_study.services.facility.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.services.facility.IRoomService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl extends FacilityServiceImpl implements IRoomService {
    static List<Facility> roomList = new ArrayList<>();
    public static final String ROOM_FILE = "src\\case_study\\data\\room_list.csv";
    static Scanner scanner = new Scanner(System.in);

    static {
        roomList = ReadAndWriteFile.readRoomListFromCSV(ROOM_FILE);
//        roomList.add(new Room("SVRO-1233", "Room1", 60, 1500000, 2,
//                RentType.DAY, "buffet"));
//        roomList.add(new Room("SVRO-3213", "Room2", 80, 2000000, 3,
//                RentType.DAY, "buffet, taxi"));
//        ReadAndWriteFile.writeListFacilityToCSV(ROOM_FILE, roomList);
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        roomList.add((Room) object);
        System.out.println("Successfully Added");
        ReadAndWriteFile.writeListFacilityToCSV(ROOM_FILE, roomList);
        displayList();
    }

    @Override
    public void displayList() {
        if (roomList.size() != 0) {
            for (Facility room : roomList) {
                System.out.println(room);
            }
        } else {
            System.out.println("List Empty");
        }
    }
}
