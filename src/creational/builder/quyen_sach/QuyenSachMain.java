package creational.builder.quyen_sach;

public class QuyenSachMain {
    public static void main(String[] args) {
        QuyenSach qs = new QuyenSach.Builder()
                .buildTuaDe("Lap trinh Java")
                .buildSoTrang(500)
                .buildTacGia("Nguyen Van A")
                .addChuong("trongdepzai1")
                .addChuong("trongdepzai2")
                .addChuong("trongdepzai3")
                .build();
        System.out.println(qs);
    }
}
