package behavioral.chain_of_responsibility.atm;

public abstract class MenhGiaATM {
    int menhGia;

    public MenhGiaATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract MenhGiaATM keTiep(MenhGiaATM m);
    public abstract void rutTien(int soTien);
}
