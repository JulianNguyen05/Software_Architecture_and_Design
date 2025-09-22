package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck d = new BBQ_Duck();
        d.setFlyBehavior(new FlyNoWay());
        d.setQuackBehavior(new SQuack());
        d.display();
    }
}
