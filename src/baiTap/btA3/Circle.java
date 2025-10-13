package baiTap.btA3;

public class Circle extends Shape{
    protected static Circle instance;

    public Circle() {
    }

    public static Circle getInstance(){
        if(instance == null){
            instance = new Circle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Drawing Circle with " + brush + ", " + paper + ", " + frame;
    }
}
