package behavioral.template_method.my_sinh_vien;

public class MainMySV {
    public static void main(String[] args) {
        MySinhVienDB ls = new MySinhVienDB();
        MySinhVien sv = new MySinhVien(1, "trong", "123", "qqq");
        MySinhVien sv1 = new MySinhVien(1, "trong", "123", "qqq");
        MySinhVien sv2 = new MySinhVien(1, "trong", "123", "qqq");
        MySinhVien sv3 = new MySinhVien(1, "trong", "123", "qqq");
    }
}
