package creational.singleton.shape;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle("Round Brush", "A4 Paper", "Wooden Frame");
            case TRIANGLE:
                return new Triangle("Triangle Brush", "A3 Paper", "Plastic Frame");
            case RECTANGLE:
                return new Rectangle("Flat Brush", "A2 Paper", "Metal Frame");
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
