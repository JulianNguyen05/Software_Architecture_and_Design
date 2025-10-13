package baiTap.btA5;

public class MainBtA5 {
    public static void main(String[] args) {
        QuyenSach quyenSach = new BuilderQuyenSach()
                .setTuaDe("Lập trình Java Cơ bản")
                .setTacGia("JulianNguyen")
                .setSoTrang(200)
                .addChuong("Giới thiệu về Java")
                .addChuong("Cấu trúc điều khiển")
                .addChuong("Lập trình hướng đối tượng")
                .addChuong("Xử lý ngoại lệ và file")
                .build();

        System.out.println(quyenSach.toString());
    }
}
