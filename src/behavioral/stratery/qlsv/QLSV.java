package behavioral.stratery.qlsv;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    private ISoSanh<SinhVien> soSanh;
    List<SinhVien> lsSV = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh){
        this.soSanh = soSanh;
    }

    public void themSinhVien(SinhVien sv){
        lsSV.add(sv);
    }
    public void sapXep(){
        lsSV.sort((o1, o2) -> soSanh.soSanh(o1, o2));
    }
    public void inDS(){
        for(SinhVien sv : lsSV){
            System.out.println(sv);
        }
    }
}
