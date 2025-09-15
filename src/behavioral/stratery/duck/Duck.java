package behavioral.stratery.duck;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(){}

    public void swim() {
        System.out.printf("\nAll ducks can swim");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior f){
        flyBehavior = f;
    }

    public void setQuackBehavior(QuackBehavior q) {
        quackBehavior = q;
    }

    public interface FlyBehavior{
        void fly();
    }

    public interface QuackBehavior{
        void quack();
    }

    public static class BBQ_Duck extends Duck{
        public BBQ_Duck(){
            flyBehavior = new FlyNoWay();
            quackBehavior = new SQuack();
        }

        @Override
        public void display(){
            System.out.printf("Duck is a BBQ Duck");
        }
    }

    public static class FlyWithWings implements FlyBehavior{
        @Override
        public void fly(){
            System.out.printf("\nDucks fly with wings");
        }
    }
    
    public static class FlyNoWay implements FlyBehavior{
        @Override
        public void fly() {
            System.out.printf("\nDucks can't fly");
        }
    }
    
    public static class Quack implements QuackBehavior{
        @Override
        public void quack(){
            System.out.printf("\nQuack!");
        }
    }
    
    public static class SQuack implements QuackBehavior{
        @Override
        public void quack(){
            System.out.printf("\nQuack!, Quack!, Quack!, .....");
        }
    }
}

