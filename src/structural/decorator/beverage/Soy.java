package structural.decorator.beverage;

public class Soy extends CondimentDecorator{
    public Soy(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 6;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.description;
    }
}
