package structural.composite.quan_li_mon_hoc;

public class QLMHMain {
    public static void main(String[] args) {
        // ===== Tạo Khóa học =====
        KhoaHoc khoaHoc = new KhoaHoc("Công nghệ thông tin 2023-2027");

        // ===== Năm 1 =====
        NamHoc nam1 = new NamHoc("Năm 1");

        KyHoc ky1 = new KyHoc("Kỳ 1");
        ky1.them(new MonHoc("Toán cao cấp A1", 3, 500000))
                .them(new MonHoc("Nhập môn lập trình C", 4, 500000))
                .them(new MonHoc("Tin học đại cương", 2, 500000));

        KyHoc ky2 = new KyHoc("Kỳ 2");
        ky2.them(new MonHoc("Cấu trúc dữ liệu & Giải thuật", 3, 500000))
                .them(new MonHoc("Cơ sở dữ liệu", 3, 500000))
                .them(new MonHoc("Mạng máy tính", 3, 500000));

        nam1.them(ky1).them(ky2);

        // ===== Năm 2 =====
        NamHoc nam2 = new NamHoc("Năm 2");

        KyHoc ky3 = new KyHoc("Kỳ 3");
        ky3.them(new MonHoc("Lập trình hướng đối tượng Java", 4, 500000))
                .them(new MonHoc("Phân tích thiết kế hệ thống", 3, 500000));

        KyHoc ky4 = new KyHoc("Kỳ 4");
        ky4.them(new MonHoc("Công nghệ phần mềm", 3, 500000))
                .them(new MonHoc("Lập trình web", 3, 500000))
                .them(new MonHoc("Hệ điều hành", 3, 500000));

        nam2.them(ky3).them(ky4);

        // ===== Thêm tất cả năm học vào khóa học =====
        khoaHoc.them(nam1).them(nam2);

        // ===== Hiển thị cấu trúc khóa học =====
        System.out.println("=== THÔNG TIN KHÓA HỌC ===");
        khoaHoc.hienThi("");

        // ===== Thống kê tổng =====
        System.out.println("\n=== THỐNG KÊ TOÀN KHÓA ===");
        System.out.println("Tổng số tín chỉ: " + khoaHoc.getSoTC());
        System.out.println("Tổng học phí: " + khoaHoc.getHocPhi() + " VNĐ");
    }
}
