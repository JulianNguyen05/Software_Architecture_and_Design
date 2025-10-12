package baiTap.btA1;
import java.util.ArrayList;
import java.util.List;

public class HoaDonBuilder1 {
    private HoaDonHeader1 header;
    private List<CTHD1> cthdList = new ArrayList<>();

    public HoaDonBuilder1 addHeader(String maHD, String ngayBan, String tenKh){
        this.header = new HoaDonHeader1(maHD, ngayBan, tenKh);
        return this;
    }

    public HoaDonBuilder1 addCTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.cthdList.add(new CTHD1(sanPham, soLuong, donGia, chietKhau));
        return this;
    }

    public HoaDon1 build(){
        return new HoaDon1(header, cthdList);
    }
}
