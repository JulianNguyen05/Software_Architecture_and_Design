package baiTap.btJ3;

public class MainSinhVienNTU {
    public static void main(String[] args) {
        SinhVienNTU sv1 = new SinhVienIT("trongdepzai", "cntt", 9,10, 9);
        SinhVienNTU sv2 = new SinhVienBiz("julian", "marketing", 5,6);
        SinhVienNTU sv3 = new SinhVienNTU("TRONGDEPZAI", "FIFA") {
            @Override
            public float getDiemTB() {
                return 7;
            }
        };

        sv1.inThongTin();
        sv2.inThongTin();
        sv3.inThongTin();
    }
}
