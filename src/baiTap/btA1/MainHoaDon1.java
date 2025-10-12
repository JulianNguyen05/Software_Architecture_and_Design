package baiTap.btA1;

public class MainHoaDon1 {
    public static void main(String[] args) {
        HoaDon1 hoaDon1 = new HoaDonBuilder1()
                .addHeader("001", "29/09/25", "trongdepzai")
                .addCTHD("Gold9999", 125000000, 1, 0.05f)
                .addCTHD("Bánh mì", 2, 15000, 0)
                .addCTHD("Nước suối", 3, 10000, 0)
                .addCTHD("Sữa tươi", 1, 25000, 5)
                .build();

        System.out.println(hoaDon1.toString());
    }
}
