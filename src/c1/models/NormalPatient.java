package c1.models;

public class NormalPatient extends Record {
    private long fee;

    public NormalPatient(int number, String recordCode, String patientCode, String patientName, String startDay,
                         String endDay, String reason, long fee) {
        super(number, recordCode, patientCode, patientName, startDay, endDay, reason);
        this.fee = fee;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + "fee=" + String.format("%-10s|", fee);
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.fee;
    }
}
