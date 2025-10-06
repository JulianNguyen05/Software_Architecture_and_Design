package baiTap.btJ1;

public class MainNhanVien {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Nguyen Van A", "20", "Ha Noi", 3000000, 140);

        nv1.setTen("Tran Thi B");
        nv1.setTuoi("22");
        nv1.setDiaChi("Hai Phong");
        nv1.setTienLuong(3500000);
        nv1.setTongSoGioLam(60);

        System.out.println("Thong tin nhan vien 1:" + "\n" + nv1.toString() + " Tien thuong: " + nv1.tinhThuong());
        System.out.println("\nThong tin nhan vien 2:" + "\n" + nv2.toString() + " Tien thuong: " + nv2.tinhThuong());
    }
}
