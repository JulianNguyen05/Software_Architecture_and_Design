package creational.builder.hoa_don;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    public HoaDon(Builder b) {
        this.header = b.header;
        this.cthds = b.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        for (var cthd: cthds) {
            builder.append("\n").append(cthd.toString());
        }
        return builder.toString();
    }

    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();

        public Builder buildHeader(String maHD, String ngayBan, String tenKH){
            header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }

        public Builder addCTHD(String sanPham, int donGia, int soLuong, float chietKhau){
            cthds.add(new CTHD(sanPham, donGia, soLuong, chietKhau));
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
