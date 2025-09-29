package creational.singleton.shape;

public class MainShape {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.createShape(ShapeType.CIRCLE);
        Shape s2 = ShapeFactory.createShape(ShapeType.RECTANGLE);
        Shape s3 = ShapeFactory.createShape(ShapeType.TRIANGLE);

        System.out.println(s1.draw());
        System.out.println(s2.draw());
        System.out.println(s3.draw());
    }
}
