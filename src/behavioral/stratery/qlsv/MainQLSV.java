package behavioral.stratery.qlsv;

import java.util.Date;

public class MainQLSV {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();

        qlsv.themSinhVien(new SinhVien("trongdepzai", new Date(), 7.5f));
        qlsv.themSinhVien(new SinhVien("julian", new Date(), 8.5f));
        qlsv.themSinhVien(new SinhVien("ht1", new Date(), 6.5f));
        qlsv.themSinhVien(new SinhVien("goku", new Date(), 9.2f));
        qlsv.themSinhVien(new SinhVien("gg", new Date(), 3.4f));

        System.out.println("=== Sắp xếp theo tên ===");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("\n=== Sắp xếp theo điểm ===");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
