package case_study.services.facility.impl;

import case_study.models.enums.RentType;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.facility.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        facilityIntegerMap.put(new Room("Room1", 60, 1500000, 2,
                RentType.HOUR, "buffet"), 0);
        facilityIntegerMap.put(new Room("Room2", 80, 2000000, 3,
                RentType.MONTH, "buffet, taxi"), 0);
        facilityIntegerMap.put(new House("House1", 200, 1000000, 2,
                RentType.DAY, "front of garden", 2), 5);
        facilityIntegerMap.put(new House("House2", 250, 15000000, 3,
                RentType.MONTH, "front of sea", 1), 2);
        facilityIntegerMap.put(new Villa("Villa1", 100, 4000000, 4,
                RentType.DAY, "Gold", 25, 1), 0);
        facilityIntegerMap.put(new Villa("Villa2", 150, 5000000, 6,
                RentType.YEAR, "Gold", 25, 1), 5);
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println("Service: " + element.getKey() + " - Number of rent: " + element.getValue());
            }
        }
    }

    @Override
    public void add(Object object) {
        facilityIntegerMap.put((Facility) object, 0);
        System.out.println("Successfully Added");
//        displayList();
    }

    @Override
    public void displayList() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + element.getKey() + "- Number of rent: " + element.getValue());
        }
    }


}
