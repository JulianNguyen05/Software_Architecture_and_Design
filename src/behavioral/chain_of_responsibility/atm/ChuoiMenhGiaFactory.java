package behavioral.chain_of_responsibility.atm;

public abstract class ChuoiMenhGiaFactory {
    protected abstract MenhGiaATM getChuoiMenhGia(int menhGia);
    public void rutTien(int soTien, int menhGiaLonNhat){
        MenhGiaATM m = getChuoiMenhGia(menhGiaLonNhat);
        m.rutTien(soTien);
    }
}
