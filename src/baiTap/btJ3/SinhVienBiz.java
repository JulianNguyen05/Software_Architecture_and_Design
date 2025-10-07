package baiTap.btJ3;

public class SinhVienBiz extends SinhVienNTU{
    private float diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, String nganh, float diemMarketing, float diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public float getDiemTB() {
        return (diemMarketing * 2.0f + diemSales) / 3;
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Học lực: " + getHocLuc() + " Điểm trung bình: " + getDiemTB());
    }
}
