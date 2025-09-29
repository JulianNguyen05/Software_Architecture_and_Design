package structural.decorator.beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 0;
    }
}
