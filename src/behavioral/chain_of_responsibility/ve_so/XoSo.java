package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public abstract class XoSo {
    String tenGiai;
    List<String> boSoTrungThuong;
    XoSo keTiep;

    public XoSo(String tenGiai, List<String> boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    public abstract XoSo thietLapKeTiep(XoSo k);
    public abstract String doVeSo(String veSo);
}
