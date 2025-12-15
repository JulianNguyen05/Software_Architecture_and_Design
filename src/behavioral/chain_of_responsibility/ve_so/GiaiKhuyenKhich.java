package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiKhuyenKhich extends XoSo{
    public GiaiKhuyenKhich(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public XoSo thietLapKeTiep(XoSo k) {
        return keTiep = k;
    }

    @Override
    public String doVeSo(String veSo) {
        String giaiThuong = boSoTrungThuong.get(0);
        int dem = 0;
        int len = giaiThuong.length();
        for (int i = 0; i < len; i++) {
            if (veSo.charAt(i) == giaiThuong.charAt(i)) {
                dem++;
            }
        }

        if (dem == len - 1) {
            return "Trúng " + tenGiai;
        }

        if(keTiep != null){
            return keTiep.doVeSo(veSo);
        }
        return "Vé số không trúng giải";
    }
}
