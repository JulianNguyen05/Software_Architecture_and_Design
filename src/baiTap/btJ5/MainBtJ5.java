package baiTap.btJ5;

public class MainBtJ5 {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();

        // Thêm sinh viên
        lopHoc.themHocSinh(new HocSinh("Nguyen Van A", "Nha Trang", "0123456789", 20, "8", "Game"));
        lopHoc.themHocSinh(new HocSinh("Nguyen Van B", "Nha Trang", "0123456789", 20, "8", "Game"));
        lopHoc.themHocSinh(new HocSinh("Nguyen Van C", "Nha Trang", "0123456789", 20, "8", "Game"));

        // Thêm giáo viên
        lopHoc.themGVGD(new GiaoVien("Nguyen Van D", "Nha Trang", "0123456789", 20, "Game", "G"));
        lopHoc.themGVGD(new GiaoVien("Nguyen Van E", "Nha Trang", "0123456789", 20, "Game", "G"));
        lopHoc.themGVGD(new GiaoVien("Nguyen Van G", "Nha Trang", "0123456789", 20, "Game", "G"));

        // Hiển thị danh sách học sinh
        System.out.println("Danh sach học sinh:");
        lopHoc.inDSHS();

        // Hiển thị danh sách giáo viên giảng dậy
        System.out.println("Danh sach giáo viên giảng dạy:");
        lopHoc.inDSHS();

    }
}

