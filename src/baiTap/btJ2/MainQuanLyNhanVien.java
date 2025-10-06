package baiTap.btJ2;

import baiTap.btJ1.NhanVien;

public class MainQuanLyNhanVien {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();

        NhanVien2 nv1 = new NhanVien2();
        NhanVien2 nv2 = new NhanVien2("Nguyen Van A", "20", "Ha Noi", 3000000, 140);
        NhanVien2 nv3 = new NhanVien2("Nguyen Van A1", "20", "Ha Noi", 3000000, 140);
        NhanVien2 nv4 = new NhanVien2("Nguyen Van A2", "20", "Ha Noi", 3000000, 140);
        NhanVien2 nv5 = new NhanVien2("Nguyen Van A3", "20", "Ha Noi", 3000000, 140);

        nv1.setTen("Trongdepzai");
        nv1.setDiaChi("NhaTrang");
        nv1.setTuoi("20");
        nv1.setTienLuong(20000);
        nv1.setTongSoGioLam(150);


        quanLyNhanVien.them(nv1);
        quanLyNhanVien.them(nv2);
        quanLyNhanVien.them(nv3);
        quanLyNhanVien.them(nv4);
        quanLyNhanVien.them(nv5);


        System.out.println("Danh sách nhân viên: ");
        quanLyNhanVien.inDS();
    }
}
