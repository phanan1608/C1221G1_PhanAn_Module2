package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService, double usableArea, double rentCost, int maximumPeopleNumber, String rentType, String freeService) {
        super(nameService, usableArea, rentCost, maximumPeopleNumber, rentType);
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
}
