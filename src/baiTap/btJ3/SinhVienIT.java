package baiTap.btJ3;

public class SinhVienIT extends SinhVienNTU{
    private float diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoTen, String nganh, float diemJava, float diemCSS, float diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public float getDiemTB() {
        return (diemJava * 2.0f + diemCSS + diemHTML) / 4;
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Học lực: " + getHocLuc() + " Điểm trung bình: " + getDiemTB());
    }
}
