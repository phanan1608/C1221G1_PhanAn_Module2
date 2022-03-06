package collection_review.models;

public class InternCandidate extends Candidates {
    private String major;
    private int semester;
    private String universityName;


    public InternCandidate(int candidateId, String firstName, String lastName, int birthDay, String address, String phone, String email, int candidateType, String major, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "InternCandidate{" +
                super.toString() +
                "major='" + major + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
