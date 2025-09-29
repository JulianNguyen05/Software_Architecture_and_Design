package creational.builder.hoa_don;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .buildHeader("001", "29/09/25", "trongdepzai")
                .addCTHD("Gold9999", 125000000, 1, 0.05f)
                .addCTHD("Duck", 100000, 2, 0)
                .addCTHD("Iphone 15 Pro Max", 33000000, 1, 0.1f)
                .build();

        System.out.println(hoaDon.toString());
    }
}
