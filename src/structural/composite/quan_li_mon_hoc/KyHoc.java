package structural.composite.quan_li_mon_hoc;

import java.util.ArrayList;
import java.util.List;

public class KyHoc extends AbstractItem {
    List<AbstractItem> lists = new ArrayList<>();

    public KyHoc(String ten) {
        super(ten);
    }

    @Override
    public AbstractItem them(AbstractItem item) {
        lists.add(item);
        return this;
    }

    @Override
    public AbstractItem xoa(AbstractItem item) {
        if(lists.contains(item)){
            lists.remove(item);
        }
        return this;
    }

    @Override
    public int getHocPhi() {
        int t = 0;
        for(AbstractItem item: lists){
            t += item.getHocPhi();
        }
        return t;
    }

    @Override
    public int getSoTC() {
        int t = 0;
        for(AbstractItem item: lists){
            t += item.getSoTC();
        }
        return t;
    }

    @Override
    public void hienThi(String prefix) {
        System.out.println(prefix + "Kì học: " + ten +
                " | Tổng TC: " + getSoTC() + " | Học phí: " + getHocPhi());
        for (AbstractItem item : lists) {
            item.hienThi(prefix + "   ");
        }
    }
}
