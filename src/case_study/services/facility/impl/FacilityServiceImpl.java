package case_study.services.facility.impl;

import case_study.models.facility.Facility;
import case_study.services.facility.IFacilityService;
import case_study.utils.ParseObjectException;
import case_study.utils.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static final String FACILITY_MAINTAIN_FILE = "src\\case_study\\data\\facility_maintain_list.csv";


    static {
//        facilityIntegerMap.put(new Room("SVRO-1233", "Room1", 60, 1500000, 2,
//                RentType.DAY, "buffet"), 0);
//        facilityIntegerMap.put(new Room("SVRO-3213", "Room2", 80, 2000000, 3,
//                RentType.DAY, "buffet, taxi"), 0);
//        facilityIntegerMap.put(new House("SVHO-1111", "House1", 200, 1000000, 2,
//                RentType.DAY, "front of garden", 2), 5);
//        facilityIntegerMap.put(new House("SVHO-1233", "House2", 250, 15000000, 3,
//                RentType.DAY, "front of sea", 1), 4);
//        facilityIntegerMap.put(new Villa("SVVL-1222", "Villa1", 100, 4000000, 4,
//                RentType.DAY, "Gold", 25, 1), 0);
//        facilityIntegerMap.put(new Villa("SVVL-3333", "Villa2", 150, 5000000, 6,
//                RentType.DAY, "Gold", 25, 1), 5);
        try {
            facilityIntegerMap = ReadAndWriteFile.readFacilityMapFromCSVFile(FACILITY_MAINTAIN_FILE);
        } catch (ParseObjectException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void displayMaintain() {
        try {
            facilityIntegerMap = ReadAndWriteFile.readFacilityMapFromCSVFile(FACILITY_MAINTAIN_FILE);
        } catch (ParseObjectException e) {
            e.printStackTrace();
        }
        ReadAndWriteFile.writeFacilityMapToCSVFile(FACILITY_MAINTAIN_FILE, facilityIntegerMap);
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
        ReadAndWriteFile.writeFacilityMapToCSVFile(FACILITY_MAINTAIN_FILE, facilityIntegerMap);
    }

    @Override
    public void displayList() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + element.getKey() + "- Number of rent: " + element.getValue());
        }
    }
//    public void countUsage(){
//        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
//            if (element.getKey().equals(booking.getFacility())) {
//                element.setValue(element.getValue() + 1);
//            }
//        }
//    }


}
