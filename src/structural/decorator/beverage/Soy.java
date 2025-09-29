package structural.decorator.beverage;

public class Soy extends CondimentDecorator{
    private int price;
    public Soy(String description, int price, Beverage beverage) {
        super(description, beverage);
        this.price = price;
    }

    @Override
    public int cost() {
        return super.cost() + price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.description;
    }
}
