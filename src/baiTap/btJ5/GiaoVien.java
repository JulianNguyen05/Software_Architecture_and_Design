package baiTap.btJ5;

public class GiaoVien extends CaNhan{
    private String monDay, toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public void hienThiTT() {
        System.out.print("""
            ==================
            Thông tin của giáo viên:
            ==================
            """);
        super.hienThiTT();
        System.out.println("Môn dạy: " + monDay + "\n" +
                            "Tổ bộ môn: " + toBoMon + "\n");
    }
}
