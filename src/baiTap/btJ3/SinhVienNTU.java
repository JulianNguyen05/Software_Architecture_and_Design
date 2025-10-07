package baiTap.btJ3;

public abstract class SinhVienNTU {
    private String hoTen, nganh;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract float getDiemTB();
    public String getHocLuc(){
        float dTB = getDiemTB();

        if(dTB > 9){
            return "Xuất sắc";
        } else if(dTB > 8){
            return "Giỏi";
        } else if(dTB > 7){
            return "Khá";
        } else if(dTB > 5){
            return "Trung bình";
        } else{
            return "Yếu";
        }
    }

    public void inThongTin(){
        System.out.println( "Sinh viên: " + hoTen + ", Ngành học: " + nganh);
    };
}
