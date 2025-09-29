package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage; // Đối tượng được decorate

    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
}
