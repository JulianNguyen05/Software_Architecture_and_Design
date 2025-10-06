package structural.composite.quan_li_mon_hoc;

public abstract class AbstractItem {
    String ten;

    public AbstractItem(String ten) {
        this.ten = ten;
    }

    public AbstractItem() {}

    public abstract AbstractItem them(AbstractItem item);
    public abstract AbstractItem xoa(AbstractItem item);

    public abstract int getHocPhi();
    public abstract int getSoTC();
    public abstract void hienThi(String prefix);
}
