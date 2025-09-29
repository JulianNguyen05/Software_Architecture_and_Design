package creational.singleton.dataAccess;

public class MainDataAccessUpgrade {
    public static void main(String[] args) {
        DataAccessUpgrade d1 = DataAccessUpgrade.getInstance("tag1");
        DataAccessUpgrade d2 = DataAccessUpgrade.getInstance("tag2");
        DataAccessUpgrade d3 = DataAccessUpgrade.getInstance("tag3");

        d1.add(new SanPham("001", "Kẹo kera", 1500, 123));
        d2.add(new SanPham("002", "Bánh kera", 1100, 124));
        d3.add(new SanPham("003", "Mì kera", 100, 23));

        System.out.println("-------D1---------");
        d1.display();
        System.out.println("------D2----------");
        d2.display();
        System.out.println("-----------D3----------");
        d3.display();
    }
}
