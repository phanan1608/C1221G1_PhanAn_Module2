package case_study.models;

public abstract class Person {
    private String fullName;
    private String gender;
    private int identityCard;
    private int telephoneNumber;
    private String emailAddress;

    public Person(String fullName, String gender, int identityCard, int telephoneNumber, String emailAddress) {
        this.fullName = fullName;
        this.gender = gender;
        this.identityCard = identityCard;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", telephoneNumber=" + telephoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
