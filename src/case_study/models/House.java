package case_study.models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(String nameService, double usableArea, double rentCost, int maximumPeopleNumber, String rentType, String roomStandard, int numberOfFloors) {
        super(nameService, usableArea, rentCost, maximumPeopleNumber, rentType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
