package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiThuong extends XoSo{
    public GiaiThuong(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public XoSo thietLapKeTiep(XoSo k) {
        return keTiep = k;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String so : boSoTrungThuong) {
            if (veSo.endsWith(so)) {
                return "Trúng " + tenGiai;
            }
        }

        if (keTiep != null) {
            return keTiep.doVeSo(veSo);
        }

        return "Vé không trúng giải!";
    }
}
