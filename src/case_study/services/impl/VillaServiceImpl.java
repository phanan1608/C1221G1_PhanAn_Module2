package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.Villa;
import case_study.services.IVillaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl implements IVillaService {
    static List<Facility> villaList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        villaList.add(new Villa("Villa1", 100, 4000000, 4, "Day", "Gold", 25, 1));
        villaList.add(new Villa("Villa2", 150, 5000000, 6, "Day", "Gold", 25, 1));
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void add(Object object) {
        villaList.add((Villa) object);
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
