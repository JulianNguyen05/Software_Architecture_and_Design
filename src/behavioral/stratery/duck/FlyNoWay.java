package behavioral.stratery.duck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Quay trên lò than....");
    }
}
