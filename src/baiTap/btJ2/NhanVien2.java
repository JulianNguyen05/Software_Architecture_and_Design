package baiTap.btJ2;

public class NhanVien2 {
    String ten, tuoi, diaChi;
    double tienLuong;
    int tongSoGioLam;

    public NhanVien2() {

    }

    public NhanVien2(String ten, String tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public String toString() {
        return "NhanVien2{" +
                "ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tienLuong=" + tienLuong +
                ", tongSoGioLam=" + tongSoGioLam +
                '}';
    }

    public double tinhThuong() {
        if (tongSoGioLam >= 200) {
            return tienLuong * 0.2;
        } else if (tongSoGioLam < 0) {
            return tienLuong;
        } else {
            return tienLuong * 0.1;
        }
    }
}
