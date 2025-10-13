package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVayF88 extends NhanVienF88{
    NhanVienF88 capTren;

    public NhanVienChoVayF88(String chucVu, String ten, int hanMucChoVay) {
        super(chucVu, ten, hanMucChoVay);
    }

    @Override
    public void duyetChoVay(int khoanVay) {
        if(khoanVay <= hanMucChoVay){
            System.out.println(chucVu + " " + ten + " đã duyệt khoản vay " + khoanVay);
        }else if(capTren != null){
            System.out.println(chucVu + " " + ten + " không đủ hạn mức, chuyển lên " + khoanVay);
            capTren.duyetChoVay(khoanVay);
        }else{
            System.out.println("Khoản vay " + khoanVay + " không được duyệt!");
        }
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 capTren) {
        this.capTren = capTren;
        return this.capTren;
    }
}
