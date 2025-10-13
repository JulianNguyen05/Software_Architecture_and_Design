package behavioral.chain_of_responsibility.f88;

public abstract class NhanVienF88 {
    String chucVu, ten;
    int hanMucChoVay;

    public NhanVienF88(String chucVu, String ten, int hanMucChoVay) {
        this.chucVu = chucVu;
        this.ten = ten;
        this.hanMucChoVay = hanMucChoVay;
    }

    public abstract void duyetChoVay(int khoanVay);

    public abstract NhanVienF88 capTren(NhanVienF88 capTren);
}
