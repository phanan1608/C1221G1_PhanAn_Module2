package exam2.models;

public abstract class Person {
    private String fullName;
    private String birthday;
    private String gender;
    private String phoneNumber;

    public Person(String fullName, String birthday, String gender, String phoneNumber) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "fullName='" + fullName + '\'' +
                        ", birthday='" + birthday + '\'' +
                        ", gender='" + gender + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'';
    }

    public String getInfoToCSV() {
        return this.fullName + "," + this.birthday + "," + this.gender + "," + this.phoneNumber;
    }


}
