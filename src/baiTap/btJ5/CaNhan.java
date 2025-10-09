package baiTap.btJ5;

public abstract class CaNhan {
    private String hoTen, diaChi, sdt;
    private int tuoi;

    public CaNhan(String hoTen, String diaChi, String sdt, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void hienThiTT(){
        System.out.println("Họ tên: " + hoTen + "\n" +
                            "Địa chỉ: " + diaChi + "\n" +
                            "Số điện thoại: " + sdt + "\n" +
                            "Tuổi: " + tuoi);
    }
}
