package behavioral.chain_of_responsibility.atm;

public class MenhGiaThapNhat extends MenhGiaATM{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public MenhGiaATM keTiep(MenhGiaATM m) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        System.out.println(soTo + " tờ mệnh giá " + menhGia);
    }
}