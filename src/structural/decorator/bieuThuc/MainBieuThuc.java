package structural.decorator.bieuThuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(6);
        BieuThuc c = new BieuThucDonGian(8);

        b = new Cong(b, 9);
        b = new Nhan(b, 8);
        b = new Cong(b, 5);

        c = new Cong(c, 6);
        c = new Chia(c, 2);
        c = new Nhan(c, 5);
        c = new Cong(c, 8);
        c = new Tru(c, 4);

        System.out.println(b.toString());
        System.out.println("\n" + c.toString());
    }
}
