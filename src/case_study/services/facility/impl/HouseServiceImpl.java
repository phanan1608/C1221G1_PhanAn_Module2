package case_study.services.facility.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.services.facility.IHouseService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceImpl implements IHouseService {
    public static List<Facility> houseList;
    public static final String HOUSE_FILE = "src\\case_study\\data\\house_list.csv";

    static {
        houseList = new ArrayList<>();
        houseList = ReadAndWriteFile.readHouseListFromCSV(HOUSE_FILE);
    }


    @Override
    public void add(Object object) {
        houseList.add((House) object);
        ReadAndWriteFile.writeListFacilityToCSV(HOUSE_FILE, houseList);
        System.out.println("Successfully Added");
    }

    @Override
    public void displayList() {
        if (houseList.size() != 0) {
            for (Facility house : houseList) {
                System.out.println(house);
            }
        } else {
            System.out.println("List Empty");
        }
    }

    public House findHouseById(String id) {
        for (Facility house : houseList) {
            if (house.getServiceId().equals(id)) {
                return (House) house;
            }
        }
        return null;
    }
}
