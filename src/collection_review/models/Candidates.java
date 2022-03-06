package collection_review.models;

public abstract class Candidates {
    private int candidateId;
    private String firstName;
    private String lastName;
    private int birthDay;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public static final int EXPERIENCE = 0;
    public static final int FRESHER = 1;
    public static final int INTERN = 2;

    public Candidates() {
    }

    public Candidates(int candidateId, String firstName, String lastName, int birthDay, String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return
                "candidateId=" + candidateId +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", birthDay=" + birthDay +
                        ", address='" + address + '\'' +
                        ", phone=" + phone +
                        ", email='" + email + '\'' +
                        ", candidateType='" + candidateType + '\'';
    }
}
