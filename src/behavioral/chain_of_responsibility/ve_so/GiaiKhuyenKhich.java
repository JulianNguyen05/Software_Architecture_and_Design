package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiKhuyenKhich extends XoSo {
    public GiaiKhuyenKhich(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public XoSo thietLapKeTiep(XoSo k) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String so : boSoTrungThuong) {
            if (veSo.endsWith(so)) {
                return "Trúng " + tenGiai;
            }
        }

        return "Vé không trúng giải";
    }
}
