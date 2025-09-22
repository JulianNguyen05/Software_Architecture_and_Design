package behavioral.stratery.duck;

public class BBQ_Duck extends Duck{
    @Override
    public void display() {
        System.out.println("Vịt quay Bắc Kinh LaSan");
        performFly();
        performQuack();
        swim();
        System.out.println("Chúc ngon.....");
    }
}
