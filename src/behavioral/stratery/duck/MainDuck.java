package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck bbqDuck = new Duck.BBQ_Duck();

        bbqDuck.display();
        bbqDuck.swim();
        bbqDuck.performQuack();
        bbqDuck.performFly();

        System.out.print("\n_____Change set runtime_____");
        bbqDuck.setFlyBehavior(new Duck.FlyWithWings());
        bbqDuck.setQuackBehavior(new Duck.Quack());

        bbqDuck.performFly();
        bbqDuck.performQuack();
    }
}
