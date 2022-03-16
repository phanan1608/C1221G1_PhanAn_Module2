package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.Room;
import case_study.services.IRoomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl implements IRoomService {
    static List<Facility> roomList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        roomList.add(new Room("Room1", 60, 1500000, 2, "Normal", "buffet"));
        roomList.add(new Room("Room2", 80, 2000000, 3, "VIP", "buffet, taxi"));
    }


    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        roomList.add((Room) object);
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
