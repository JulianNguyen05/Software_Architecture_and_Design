package behavioral.chain_of_responsibility.atm;

public class MenhGia extends MenhGiaATM{
    MenhGiaATM keTiep;

    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public MenhGiaATM keTiep(MenhGiaATM m) {
        this.keTiep = m;
        return this.keTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        int soDu = soTien % menhGia;
        if(soTo > 0){
            System.out.println(soTo + " tờ mệnh giá " + menhGia);
        }
        if(soDu > 0){
            this.keTiep.rutTien(soDu);
        }
    }
}
