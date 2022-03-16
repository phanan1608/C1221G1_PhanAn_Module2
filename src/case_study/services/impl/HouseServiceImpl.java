package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.services.IHouseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl implements IHouseService {
    static List<Facility> houseList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        houseList.add(new House("House1", 200, 1000000, 2, "week", "front of garden", 2));
        houseList.add(new House("House2", 250, 15000000, 3, "week", "front of sea", 1));
    }


    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        houseList.add((House) object);
    }

    @Override
    public void displayList() {
        if (houseList.size() != 0) {
            for (Facility house : houseList) {
                System.out.println(house);
            }
        } else {
            System.err.println("List Empty");
        }
    }
}
