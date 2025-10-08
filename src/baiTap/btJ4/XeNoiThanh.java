package baiTap.btJ4;

public class XeNoiThanh extends ChuyenXe{
    private int soTuyen, soKmDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void xuatThongTin() {
        System.out.println("=== Chuyến xe nội thành ===");
        super.xuatThongTin();
        System.out.println("Số tuyến: " + soTuyen);
        System.out.println("Số km đi được: " + soKmDiDuoc);
    }
}
