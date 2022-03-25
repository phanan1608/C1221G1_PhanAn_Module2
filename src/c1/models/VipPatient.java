package c1.models;

public class VipPatient extends Record {
    private String vipType;
    private int vipTerm;

    public VipPatient(int number, String code, String patientCode, String patientName, String startDay,
                      String endDay, String reason, String vipType, int vipTerm) {
        super(number, code, patientCode, patientName, startDay, endDay, reason);
        this.vipType = vipType;
        this.vipTerm = vipTerm;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public int getVipTerm() {
        return vipTerm;
    }

    public void setVipTerm(int vipTerm) {
        this.vipTerm = vipTerm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "vipType=" + String.format("%-6s|", vipType) +
                "vipTerm=" + String.format("%-6s|", vipTerm);
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.vipType + "," + this.vipTerm;
    }
}
