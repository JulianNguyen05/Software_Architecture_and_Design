package creational.singleton.shape;

public class Rectangle extends Shape{
    private static Rectangle instance;

    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Rectangle getInstance() {
        if(instance == null) {
            instance = new Rectangle("Default Brush", "Default Paper", "Default Frame");
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
