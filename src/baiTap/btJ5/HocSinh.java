package baiTap.btJ5;

public class HocSinh extends CaNhan{
    private String lop, nangKhieu;

    public HocSinh(String hoTen, String diaChi, String sdt, int tuoi, String lop, String nangKhieu) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public void hienThiTT() {
        System.out.print("""
            ==================
            Thông tin của học sinh:
            ==================
            """);
        super.hienThiTT();
        System.out.println("Lớp: " + lop + "\n" +
                "Năng khiếu: " + nangKhieu + "\n");
    }
}
