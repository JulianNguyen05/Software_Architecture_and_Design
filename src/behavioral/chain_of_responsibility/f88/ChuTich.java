package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NhanVienF88{
    public ChuTich(String chucVu, String ten, int hanMucChoVay) {
        super(chucVu, ten, hanMucChoVay);
    }

    @Override
    public void duyetChoVay(int khoanVay) {
        if(khoanVay <= hanMucChoVay)
            System.out.println(chucVu + " " + ten + " duyet cho vay " + khoanVay);
        else
            System.out.println("Ra ngân hàng vay!!!");
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 capTren) {
        return null;
    }
}
