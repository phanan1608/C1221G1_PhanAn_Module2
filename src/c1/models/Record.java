package c1.models;

public abstract class Record {
    private int number;
    private String recordCode;
    private String patientCode;
    private String patientName;
    private String startDay;
    private String endDay;
    private String reason;

    public Record(int number, String recordCode, String patientCode, String patientName,
                  String startDay, String endDay, String reason) {
        this.number = number;
        this.recordCode = recordCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.startDay = startDay;
        this.endDay = endDay;
        this.reason = reason;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "number=" + String.format("%-3s|", number) +
                "recordCode=" + String.format("%-5s|", recordCode) +
                "patientCode=" + String.format("%-5s|", patientCode) +
                "patientName=" + String.format("%-15s|", patientName) +
                "startDay=" + String.format("%-10s|", startDay) +
                "endDay=" + String.format("%-10s|", endDay) +
                "reason=" + String.format("%-10s|", reason);
    }

    public String getInfoToCSV() {
        return this.number + "," + this.recordCode + "," + this.patientCode + "," + this.patientName
                + "," + this.startDay + "," + this.endDay + "," + this.reason;
    }
}
