package case_study.services.facility.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.services.facility.IRoomService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl extends FacilityServiceImpl implements IRoomService {
    public static List<Facility> roomList;
    public static final String ROOM_FILE = "src\\case_study\\data\\room_list.csv";

    static {
        roomList = new ArrayList<>();
        roomList = ReadAndWriteFile.readRoomListFromCSV(ROOM_FILE);
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
