package baiTap.btJ4;

public class MainBtJ4 {
    public static void main(String[] args) {
        ChuyenXe cx1 = new XeNgoaiThanh("001", "A", "123", 12, "NhaTrang", "16/07");
        ChuyenXe cx2 = new XeNgoaiThanh("002", "A", "123", 12, "NhaTrang", "16/07");
        ChuyenXe cx3 = new XeNgoaiThanh("003", "A", "123", 12, "NhaTrang", "16/07");

        ChuyenXe cx4 = new XeNoiThanh("004", "A", "123", 12, 1, 100);
        ChuyenXe cx5 = new XeNoiThanh("005", "A", "123", 12, 1, 100);
        ChuyenXe cx6 = new XeNoiThanh("006", "A", "123", 12, 1, 100);

        QuanLyChuyenXe ql = new QuanLyChuyenXe();

        ql.themChuyenXe(cx1);
        ql.themChuyenXe(cx2);
        ql.themChuyenXe(cx3);
        ql.themChuyenXe(cx4);
        ql.themChuyenXe(cx5);
        ql.themChuyenXe(cx6);

        ql.xuatDanhSach();

        System.out.println("Tổng doanh thu nội thành: " + ql.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu ngoại thành: " + ql.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu tất cả: " + ql.tongDoanhThu());
    }
}
