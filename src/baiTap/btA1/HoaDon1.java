package baiTap.btA1;

import creational.builder.hoa_don.HoaDonHeader;

import java.util.List;

public class HoaDon1 {
    private HoaDonHeader1 header;
    private List<CTHD1> cthdList;

    public HoaDon1(HoaDonHeader1 header, List<CTHD1> cthdList) {
        this.header = header;
        this.cthdList = cthdList;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "header=" + header +
                ", cthdList=" + cthdList +
                '}';
    }
}
