package case_study.models;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer(String fullName, String gender, String dayOfBirth, String identityCard, String telephoneNumber, String emailAddress, String customerId, String customerType, String address) {
        super(fullName, gender, dayOfBirth, identityCard, telephoneNumber, emailAddress);
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
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
                "customerCode='" + customerId + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
