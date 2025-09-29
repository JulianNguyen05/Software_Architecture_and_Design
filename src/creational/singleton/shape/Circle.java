package creational.singleton.shape;

public class Circle extends Shape{
    private static Circle instance;

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Circle getInstance() {
        if(instance == null) {
            instance = new Circle("Default Brush", "Default Paper", "Default Frame");
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Circle";
    }
}
