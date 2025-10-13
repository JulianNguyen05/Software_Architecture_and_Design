package baiTap.btA3;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        switch (shapeType){
            case RECTANGLE:
                return Rectangle.getInstance();
            case TRIANGLE:
                return Triangle.getInstance();
            case CIRCLE:
                return Circle.getInstance();
            default:
                return null;
        }
    }
}
