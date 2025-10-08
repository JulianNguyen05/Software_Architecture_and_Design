package baiTap.btJ4;

public class XeNgoaiThanh extends ChuyenXe{
    String noiDen, soNgayDi;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, String soNgayDi) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(String soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public void xuatThongTin() {
        System.out.println("=== Chuyến xe ngoại thành ===");
        super.xuatThongTin();
        System.out.println("Nơi đến: " + noiDen);
        System.out.println("Số ngày đi: " + soNgayDi);
    }
}
