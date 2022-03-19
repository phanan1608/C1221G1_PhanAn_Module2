package case_study.services.facility.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.Villa;
import case_study.services.facility.IVillaService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class VillaServiceImpl implements IVillaService {
    public static List<Facility> villaList;
    public static final String VILLA_FILE = "src\\case_study\\data\\villa_list.csv";

    static {
        villaList = new ArrayList<>();
        villaList = ReadAndWriteFile.readVillaListFromCSV(VILLA_FILE);
    }

    @Override
    public void add(Object object) {
        villaList.add((Villa) object);
        System.out.println("Successfully Added");
        ReadAndWriteFile.writeListFacilityToCSV(VILLA_FILE, villaList);
        displayList();
    }

    @Override
    public void displayList() {
        if (villaList.size() != 0) {
            for (Facility villa : villaList) {
                System.out.println(villa);
            }
        } else {
            System.out.println("List Empty");
        }
    }
}
