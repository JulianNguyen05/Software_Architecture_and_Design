package behavioral.observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();
        NhaDauTu a = new NhaDauTuA(tiGia);
        NhaDauTu b = new NhaDauTuB(tiGia);
        System.out.println("===Cả hai nhà đầu tư===");
        tiGia.thayDoiTiGia(5);
        System.out.println("===Chỉ có một===");
        a.huyDangKy();
        tiGia.thayDoiTiGia(-3);
        System.out.println("===Đăng ký lại===");
        a.dangKy();
        tiGia.thayDoiTiGia(2);

    }
}
