package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class MainVeSo {
    public static void main(String[] args) {
        List<String> soDacBiet = List.of("123456");
        List<String> soNhat = List.of("11111");
        List<String> soNhi = List.of("3456");
        List<String> soBa = List.of("456");
        List<String> soTu = List.of("9");

        XoSo giaiDacBiet = new GiaiThuong("Giải Đặc Biệt", soDacBiet);
        XoSo giaiKhuyenKhich = new GiaiThuong("Giải Khuyến Khích", soDacBiet);
        XoSo giaiNhat = new GiaiThuong("Giải Nhất", soNhat);
        XoSo giaiNhi = new GiaiThuong("Giải Nhì", soNhi);
        XoSo giaiBa = new GiaiThuong("Giải Ba", soBa);
        XoSo giaiTu = new GiaiThapNhat("Giải Tư", soTu);

        giaiDacBiet
                .thietLapKeTiep(giaiKhuyenKhich)
                .thietLapKeTiep(giaiNhat)
                .thietLapKeTiep(giaiNhi)
                .thietLapKeTiep(giaiBa)
                .thietLapKeTiep(giaiTu);

        String veSo = "123256";

        System.out.println("Vé số: " + veSo);
        String ketQua = giaiDacBiet.doVeSo(veSo);

        System.out.println("Kết quả: " + ketQua);
    }
}
