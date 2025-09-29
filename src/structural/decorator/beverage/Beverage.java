package structural.decorator.beverage;

public abstract class Beverage {
    protected String description;

    public Beverage(String description) {
        this.description = description;
    }

    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
