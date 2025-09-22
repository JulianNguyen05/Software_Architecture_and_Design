package creational.singleton.sanpham;

public class MainDataAccess {
    public static void main(String[] args) {
        DataAccess ui1 = DataAccess.getInstance();
        DataAccess ui2 = DataAccess.getInstance();
        DataAccess ui3 = DataAccess.getInstance();

        ui1.add(new SanPham("001", "Kẹo kera", 1500, 123));
        ui1.add(new SanPham("002", "Bánh kera", 1100, 124));
        ui2.add(new SanPham("003", "Mì kera", 100, 23));
        ui1.display();
        System.out.println("...........UI2.........");
        ui2.display();


    }
}
