package baiTap.btA3;

public class Rectangle extends Shape{
    protected static Rectangle instance;

    public Rectangle() {
    }

    public static Rectangle getInstance(){
        if(instance == null){
            instance = new Rectangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Drawing Rectangle with " + brush + ", " + paper + ", " + frame;
    }
}
