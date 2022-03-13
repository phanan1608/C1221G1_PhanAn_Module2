package read_and_write_file_review.utils;

public class Validate {
    public static boolean checkCarLicensePlates(String licensePlates, String type) {
//        + Ôtô: XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)
        if ("bus".equals(type)) {
            final String BUS_CAR_LICENSE_PLATES = "^\\d{2}B-\\d{3}\\.\\d{2}$";
            return licensePlates.matches(BUS_CAR_LICENSE_PLATES);
        } else {
            final String TRAVEL_CAR_LICENSE_PLATES = "^\\d{2}A-\\d{3}\\.\\d{2}$";
            return licensePlates.matches(TRAVEL_CAR_LICENSE_PLATES);
        }
    }

    public static boolean checkTruckLicensePlates(String licensePlates) {
//        Xe tải: XXC-XXX.XX (X : 0÷9)
        final String TRUCK_LICENSE_PLATES = "^\\d{2}C-\\d{3}\\.\\d{2}$";
        return licensePlates.matches(TRUCK_LICENSE_PLATES);
    }

    public static boolean checkMotorbikeLicensePlates(String licensePlates) {
//        Xe máy: XX-YZ-XXX.XX (X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa).
        final String MOTORBIKE_LICENSE_PLATES = "^\\d{2}-[A-Z][0-9]-\\d{3}\\.\\d{2}$";
        return licensePlates.matches(MOTORBIKE_LICENSE_PLATES);
    }
}

