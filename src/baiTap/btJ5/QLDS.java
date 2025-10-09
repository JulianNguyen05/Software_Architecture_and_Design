package baiTap.btJ5;

import java.util.List;

public class QLDS implements IQLDS{
    List<CaNhan> caNhanList;

    public QLDS() {
    }

    public QLDS(List<CaNhan> caNhanList) {
        this.caNhanList = caNhanList;
    }

    public List<CaNhan> getCaNhanList() {
        return caNhanList;
    }

    public void setCaNhanList(List<CaNhan> caNhanList) {
        this.caNhanList = caNhanList;
    }

    @Override
    public void them(CaNhan p) {
        caNhanList.add(p);
    }

    @Override
    public void xoa(String ten) {
        caNhanList.removeIf(p -> p.getHoTen().equals(ten));
    }

    @Override
    public void inDS() {
        caNhanList.forEach(CaNhan::hienThiTT);
    }
}
