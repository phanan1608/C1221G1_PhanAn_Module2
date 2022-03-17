package case_study.models.facility;

import case_study.models.enums.RentType;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceId, String nameService, double usableArea, double rentCost, int maximumPeopleNumber, RentType rentType, String freeService) {
        super(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.freeService;
    }
}
