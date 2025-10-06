package structural.composite.quan_li_mon_hoc;

public class MonHoc extends AbstractItem{
    private int soTC;
    private int hocPhiMoiTC;

    public MonHoc(String ten, int soTC, int hocPhiMoiTC) {
        super(ten);
        this.soTC = soTC;
        this.hocPhiMoiTC = hocPhiMoiTC;
    }

    @Override
    public AbstractItem them(AbstractItem item) {
        return null;
    }

    @Override
    public AbstractItem xoa(AbstractItem item) {
        return null;
    }

    @Override
    public int getHocPhi() {
        return soTC * hocPhiMoiTC;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public void hienThi(String prefix) {
        System.out.println(prefix + "- " + ten + " (" + soTC + " tín chỉ, " + getHocPhi() + "đ)");
    }
}
