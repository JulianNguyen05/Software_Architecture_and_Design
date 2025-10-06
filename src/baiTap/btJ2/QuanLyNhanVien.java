package baiTap.btJ2;

import baiTap.btJ1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien2> nhanVienList = new ArrayList<>();

    @Override
    public void them(NhanVien2 nv) {
        nhanVienList.add(nv);
    }

    @Override
    public void inDS() {
        int c = 0;
        for(NhanVien2 nvs : nhanVienList) {
            c++;
            System.out.println("Nhân viên " + c + " :" + nvs.toString() + " Tiền thưởng" + nvs.tinhThuong());
        }
    }
}
