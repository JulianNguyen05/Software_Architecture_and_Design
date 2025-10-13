package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        // Tạo các nhân viên
        NhanVienChoVayF88 nvA = new NhanVienChoVayF88("Nhân viên", "trongdepzai", 5_000_000);
        NhanVienChoVayF88 nvB = new NhanVienChoVayF88("Phó phòng", "Julian", 10_000_000);
        NhanVienChoVayF88 nvC = new NhanVienChoVayF88("Phó chú tịch", "Trong", 40_000_000);
        ChuTich chuTich = new ChuTich("Chủ tịch", "Phạm Văn Chủ", 50_000_000);

        nvA.capTren(nvB)
                .capTren(nvC)
                        .capTren(chuTich);

        System.out.println("\n--- Thử khoản vay 5 triệu ---");
        nvA.duyetChoVay(5_000_000);

        System.out.println("\n--- Thử khoản vay 10 triệu ---");
        nvA.duyetChoVay(10_000_000);

        System.out.println("\n--- Thử khoản vay 45 triệu ---");
        nvA.duyetChoVay(45_000_000);

        System.out.println("\n--- Thử khoản vay 2 tỷ ---");
        nvA.duyetChoVay(2_000_000_000);
    }
}
