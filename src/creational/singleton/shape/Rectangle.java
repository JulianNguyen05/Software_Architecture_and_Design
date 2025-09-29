package creational.singleton.shape;

public class Rectangle extends Shape{
    private static Rectangle instance;

    private Rectangle(){}

    public static Rectangle getInstance() {
        if(instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
