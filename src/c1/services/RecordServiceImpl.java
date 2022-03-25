package c1.services;

import c1.models.Record;
import c1.utils.NotFoundMedicalRecordException;
import c1.utils.ReadAndWriteFile;

import java.util.List;

public class RecordServiceImpl implements IService<Record> {
    static List<Record> recordList;
    public static final String RECORDS_FILE = "src\\exam_module2\\data\\medical_records.csv";

    static {
        recordList = ReadAndWriteFile.readBankAccountFromCSV(RECORDS_FILE);
    }

    @Override
    public void add(Record object) {
        recordList.add(object);
        System.out.println("Đã thêm bệnh án thành công");
        ReadAndWriteFile.writeListBankAccountToCSV(RECORDS_FILE, recordList);
    }

    @Override
    public void displayList() {
        if (recordList.size() != 0) {
            for (Record record : recordList) {
                System.out.println(record);
            }
        } else {
            System.out.println("Danh sách rỗng!!!");
        }
    }


    @Override
    public void remove(Record object) {
        recordList.remove(object);
        System.out.println("Đã xoá thành công");
        ReadAndWriteFile.writeListBankAccountToCSV(RECORDS_FILE, recordList);
    }


    @Override
    public List<Record> getList() {
        return recordList;
    }

    @Override
    public Record findObjectByRecordCode(String recordCode) throws NotFoundMedicalRecordException {
        for (Record record : recordList) {
            if (record.getRecordCode().equals(recordCode)) {
                return record;
            }
        }
        throw new NotFoundMedicalRecordException("Bệnh án không tồn tại");
    }
}
