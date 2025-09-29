package creational.singleton.shape;

public class Triangle extends Shape{
    private static Triangle instance;

    private Triangle(){}

    public static Triangle getInstance() {
        if(instance == null) {
            instance = new Triangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Triangle";
    }
}
