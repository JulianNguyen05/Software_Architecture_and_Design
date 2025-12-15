package behavioral.stratery.tinh;

public class MainTinh {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + context.tinh(75, 12));

        context.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + context.tinh(54, 78));
    }
}
