package baiTap.btA3;

public class Triangle extends Shape{
    protected static Triangle instance;

    public Triangle() {
    }

    public static Triangle getInstance(){
        if(instance == null){
            instance = new Triangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Drawing Triangle with " + brush + ", " + paper + ", " + frame;
    }

}
