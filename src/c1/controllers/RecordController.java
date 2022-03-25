package c1.controllers;

import c1.models.NormalPatient;
import c1.models.Record;
import c1.models.VipPatient;
import c1.services.IService;
import c1.services.RecordServiceImpl;
import c1.utils.InputData;
import c1.utils.NotFoundMedicalRecordException;
import c1.utils.Validate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class RecordController {
    IService<Record> recordIService = new RecordServiceImpl();
    Scanner scanner = new Scanner(System.in);
    int number;
    String recordCode;
    String patientCode;
    String patientName;
    String startDay;
    String endDay;
    String reason;

    public void add() {
        int choice;
        do {
            System.out.println("Chọn loại Bệnh nhân muốn thêm Bệnh án:");
            System.out.println("1. Bệnh án VIP:");
            System.out.println("2. Bệnh án Thường:");
            choice = InputData.inputIntegerChoice();
            switch (choice) {
                case 1:
                    System.out.println("Thêm bệnh án bệnh nhân VIP");
                    addVipPatient();
                    break;
                case 2:
                    addPNormalPatient();
                    System.out.println("Thêm bệnh án bệnh nhân Thường");
                    break;
                default:
                    System.out.println("Chỉ được chọn 1 hoặc 2. Vui lòng nhập lại");
            }
            System.out.print("Bạn có muốn tiếp tục (Y/N) ");
            String confirm = scanner.nextLine();
            if ("n".equalsIgnoreCase(confirm.toLowerCase())) {
                break;
            }
        } while (true);
    }

    public void addVipPatient() {
        inputRecordInformationCommon();
        String vipType = getVipTypeFromInput();
        System.out.print("Nhập thời hạn VIP: ");
        int vipTerm = Integer.parseInt(scanner.nextLine());
        Record record = new VipPatient(
                number,
                recordCode,
                patientCode,
                patientName,
                startDay,
                endDay,
                reason,
                vipType,
                vipTerm);
        recordIService.add(record);
    }

    public void addPNormalPatient() {
        inputRecordInformationCommon();
        System.out.print("Nhập chi phí: ");
        long fee = Long.parseLong(scanner.nextLine());
        Record record = new NormalPatient(
                number,
                recordCode,
                patientCode,
                patientName,
                startDay,
                endDay,
                reason,
                fee);
        recordIService.add(record);
    }

    public void inputRecordInformationCommon() {
        number = setAutoId();
        System.out.print("Nhập Mã bệnh án: ");
        recordCode = Validate.regexRecordCodeInput(scanner.nextLine(), "Mã bệnh án phải là: BA-XXX, với XXX là các kí tự số");
        System.out.print("Nhập Mã bệnh nhân: ");
        patientCode = Validate.regexPatientCodeInput(scanner.nextLine(), "Mã bệnh nhân phải là: BN-XXX, với XXX là các kí tự số");
        System.out.print("Nhập Tên bệnh nhân: ");
        patientName = scanner.nextLine();
        System.out.print("Nhập Ngày nhập viện: ");
        startDay = Validate.regexDate(scanner.nextLine(), "Ngày có định dạng dd/MM/yyyy");
        endDay = getEndDateFromInput(startDay);
        System.out.print("Nhập Lý do nhập viện: ");
        reason = scanner.nextLine();
    }

    public int setAutoId() {
        int id = 1;
        List<Record> list = recordIService.getList();
        if (!list.isEmpty()) {
            id = list.get(list.size() - 1).getNumber() + 1;
        }
        return id;
    }

    private String getVipTypeFromInput() {
        String[] list = {"VIPI", "VIPII", "VIPIII"};
        System.out.println("Chọn trạng thái");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("[%d] - %s \t", i, list[i]);
        }
        System.out.println();
        do {
            int choice;
            try {
                System.out.print("Nhập lựa chọn: ");
                choice = Integer.parseInt(scanner.nextLine());
                return list[choice];
            } catch (NumberFormatException e) {
                System.out.println("Only number accepted");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Only input from 0 - " + (list.length - 1));
            }
        } while (true);
    }

    public void displayList() {
        recordIService.displayList();
    }

    public void delete() {
        displayList();
        System.out.println("Nhập vào Mã Bệnh án cần xoá");
        String keyword = scanner.nextLine();
        try {
            Record record = recordIService.findObjectByRecordCode(keyword);
            System.out.println("Đã tìm thấy. Bạn có muốn xoá (Y/N)");
            if ("y".equals(scanner.nextLine())) {
                recordIService.remove(record);
                displayList();
            }
        } catch (NotFoundMedicalRecordException e) {
            System.out.println(e.getMessage());
        }
    }


    private String getEndDateFromInput(String startDate) {
        String endDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            System.out.print("Nhập vào ngày xuất viện: ");
            endDate = case_study.utils.Validate.regexDate(scanner.nextLine(), "Ngày phải có định dạng (dd/mm/yyyy)");
            LocalDate endDateFormat = LocalDate.parse(endDate, formatter);
            LocalDate startDateFormat = LocalDate.parse(startDate, formatter);
            int day = Period.between(startDateFormat, endDateFormat).getDays();
            if (day < 0) {
                System.out.println("Ngày kêý thúc không được trước ngày bắt đầu");
            } else {
                break;
            }
        } while (true);
        return endDate;
    }
}



