package baiTap.btA3;

public class MainBtA3 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape rect1 = factory.createShape(ShapeType.RECTANGLE);
        Shape rect2 = factory.createShape(ShapeType.RECTANGLE);

        Shape tri = factory.createShape(ShapeType.TRIANGLE);
        Shape cir = factory.createShape(ShapeType.CIRCLE);

        System.out.println(rect1.draw());
        System.out.println(tri.draw());
        System.out.println(cir.draw());

        System.out.println("rect1 == rect2 ? " + (rect1 == rect2));
    }
}
