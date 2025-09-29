package structural.decorator.beverage;

public class Whip extends CondimentDecorator{
    public Whip(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.description;
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
