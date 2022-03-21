package case_study.models.person;

import case_study.models.enums.CustomerType;

public class Customer extends Person {
    private String customerId;
    private CustomerType customerType;
    private String address;

    public Customer(String fullName, String dayOfBirth, String gender, String identityCard, String telephoneNumber,
                    String emailAddress, String customerId, CustomerType customerType, String address) {
        super(fullName, dayOfBirth, gender, identityCard, telephoneNumber, emailAddress);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerId='" + customerId + '\'' +
                ", customerType=" + customerType +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.customerId + "," + this.customerType + "," + this.address;
    }
}
