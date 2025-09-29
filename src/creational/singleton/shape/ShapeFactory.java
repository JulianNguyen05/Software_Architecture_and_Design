package creational.singleton.shape;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) {
        switch(type) {
            case CIRCLE:
                return Circle.getInstance();
            case RECTANGLE:
                return Rectangle.getInstance();
            case TRIANGLE:
                return Triangle.getInstance();
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
