package creational.builder.hoa_don;

public class CTHD {
    String sanPham;
    int donGia;
    int soLuong;
    float chietKhau;

    public CTHD(String sanPham, int donGia, int soLuong, float chietKhau) {
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", chietKhau=" + chietKhau +
                '}';
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
}
