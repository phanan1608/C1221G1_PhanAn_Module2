package case_study.models.facility;

import case_study.models.enums.RentType;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(String serviceId, String nameService, double usableArea, double rentCost, int maximumPeopleNumber,
                 RentType rentType, String roomStandard, int numberOfFloors) {
        super(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber, rentType);
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

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.roomStandard + "," + this.numberOfFloors;
    }
}
