package case_study.services.facility.impl;

import case_study.models.enums.RentType;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.services.facility.IHouseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl implements IHouseService {
    static List<Facility> houseList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        houseList.add(new House("SVHO-1111", "House1", 200, 1000000, 2,
                RentType.DAY, "front of garden", 2));
        houseList.add(new House("SVHO-1233", "House2", 250, 15000000, 3,
                RentType.DAY, "front of sea", 1));
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        houseList.add((House) object);
        System.out.println("Successfully Added");
        displayList();
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
