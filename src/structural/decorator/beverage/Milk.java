package structural.decorator.beverage;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.description;
    }
}
