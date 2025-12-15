package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class MainVeSo {
    public static void main(String[] args) {
        List<String> soDacBiet = List.of("123456");
        List<String> soNhat = List.of("23456");
        List<String> soNhi = List.of("3456");
        List<String> soBa = List.of("456");
        List<String> soKhuyenKhich = List.of("6");

        XoSo giaiDacBiet = new GiaiThuong("Giải Đặc Biệt", soDacBiet);
        XoSo giaiNhat = new GiaiThuong("Giải Nhất", soNhat);
        XoSo giaiNhi = new GiaiThuong("Giải Nhì", soNhi);
        XoSo giaiBa = new GiaiThuong("Giải Ba", soBa);
        XoSo giaiKhuyenKhich = new GiaiKhuyenKhich("Giải Khuyến Khích", soKhuyenKhich);

        giaiDacBiet
                .thietLapKeTiep(giaiNhat)
                .thietLapKeTiep(giaiNhi)
                .thietLapKeTiep(giaiBa)
                .thietLapKeTiep(giaiKhuyenKhich);

        String veSo = "456";

        System.out.println("Vé số: " + veSo);
        String ketQua = giaiDacBiet.doVeSo(veSo);

        System.out.println("Kết quả: " + ketQua);
    }
}
