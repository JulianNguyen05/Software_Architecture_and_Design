package baiTap.btA1;

public class HoaDonHeader1 {
    private String maHD, ngayBan, tenKH;

    public HoaDonHeader1(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader1{" +
                "maHD='" + maHD + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
