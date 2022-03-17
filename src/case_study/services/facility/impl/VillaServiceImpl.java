package case_study.services.facility.impl;

import case_study.models.enums.RentType;
import case_study.models.facility.Facility;
import case_study.models.facility.Villa;
import case_study.services.facility.IVillaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl implements IVillaService {
    static List<Facility> villaList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        villaList.add(new Villa("SVVL-1222", "Villa1", 100, 4000000, 4,
                RentType.DAY, "Gold", 25, 1));
        villaList.add(new Villa("SVVL-3333", "Villa2", 150, 5000000, 6,
                RentType.DAY, "Gold", 25, 1));
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        villaList.add((Villa) object);
        System.out.println("Successfully Added");
        displayList();
    }

    @Override
    public void displayList() {
        if (villaList.size() != 0) {
            for (Facility villa : villaList) {
                System.out.println(villa);
            }
        } else {
            System.err.println("List Empty");
        }
    }
}
