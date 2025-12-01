package creational.state.thueBao;

public class MainThueBao {
    public static void main(String[] args) {
        ThueBao tb = new ThueBao("Trongdepzai", 0,new Normal());
        System.out.println("\nNạp 120k");
        tb.napTien(120_000);
        tb.print();
        System.out.println("\nNạp 30k");
        tb.napTien(30_000);
        tb.print();
//        System.out.println("\nNạp 100k");
//        tb.napTien(100_000);
//        tb.print();
        System.out.println("\nGọi điện 50 phút");
        tb.thucHienCuocGoi(50*60);
        tb.print();
    }
}
