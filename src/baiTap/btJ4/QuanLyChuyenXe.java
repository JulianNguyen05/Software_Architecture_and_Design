package baiTap.btJ4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    private List<ChuyenXe> listChuyenXes = new ArrayList<>();

    public void themChuyenXe(ChuyenXe cx){
        listChuyenXes.add(cx);
    }

    public void xuatDanhSach(){
        for(ChuyenXe cx : listChuyenXes){
            cx.xuatThongTin();
            System.out.println("----------------------------");
        }
    }

    public double tinhDoanhThuNoiThanh(){
        double tong = 0;
        for(ChuyenXe cx : listChuyenXes){
            if(cx instanceof XeNoiThanh){
                tong += cx.getDoanhThu();
            }
        }
        return tong;
    }

    public double tinhDoanhThuNgoaiThanh(){
        double tong = 0;
        for(ChuyenXe cx : listChuyenXes){
            if(cx instanceof XeNgoaiThanh){
                tong += cx.getDoanhThu();
            }
        }
        return tong;
    }

    public double tongDoanhThu(){
        double tong = 0;
        for(ChuyenXe cx : listChuyenXes){
            tong += cx.getDoanhThu();
        }
        return tong;
    }
}
