package case_study.models.facility;

import case_study.models.enums.RentType;

public abstract class Facility {
    private String serviceId;
    private String nameService;
    private double usableArea;
    private double rentCost;
    private int maximumPeopleNumber;
    private RentType rentType;

    public Facility(String serviceId, String nameService, double usableArea, double rentCost, int maximumPeopleNumber, RentType rentType) {
        this.serviceId = serviceId;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maximumPeopleNumber = maximumPeopleNumber;
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaximumPeopleNumber() {
        return maximumPeopleNumber;
    }

    public void setMaximumPeopleNumber(int maximumPeopleNumber) {
        this.maximumPeopleNumber = maximumPeopleNumber;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceId='" + serviceId + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maximumPeopleNumber=" + maximumPeopleNumber +
                ", rentType=" + rentType +
                '}';
    }
}
