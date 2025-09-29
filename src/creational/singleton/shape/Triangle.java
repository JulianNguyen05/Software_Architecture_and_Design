package creational.singleton.shape;

public class Triangle extends Shape{
    private static Triangle instance;

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Triangle getInstance() {
        if(instance == null) {
            instance = new Triangle("Default Brush", "Default Paper", "Default Frame");
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Triangle";
    }
}
