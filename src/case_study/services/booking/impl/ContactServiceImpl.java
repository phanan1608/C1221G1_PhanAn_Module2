package case_study.services.booking.impl;

import case_study.models.booking.Contract;
import case_study.services.booking.IContactService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements IContactService {
    public static List<Contract> contractList;
    public static final String CONTRACT_FILE = "src\\case_study\\data\\contract_list.csv";

    static {
        contractList = new ArrayList<>();
        contractList = ReadAndWriteFile.readContractListFromCSV(CONTRACT_FILE);
    }

    @Override
    public void edit(int index, Contract contract) {
        contractList.set(index, contract);
        System.out.println("Successfully edited");
        ReadAndWriteFile.writeListContractToCSV(CONTRACT_FILE, contractList);
        System.out.println(contractList.get(index));
    }

    @Override
    public void add(Object object) {
        contractList.add((Contract) object);
        ReadAndWriteFile.writeListContractToCSV(CONTRACT_FILE, contractList);
        System.out.println("Successfully Added");
    }

    @Override
    public void displayList() {
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }
}
