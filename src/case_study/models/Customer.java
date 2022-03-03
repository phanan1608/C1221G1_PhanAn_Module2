package case_study.models;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer(String fullName, String gender, int identityCard, int telephoneNumber,
                    String emailAddress, String customerCode, String customerType, String address) {
        super(fullName, gender, identityCard, telephoneNumber, emailAddress);
        this.customerId = customerCode;
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
