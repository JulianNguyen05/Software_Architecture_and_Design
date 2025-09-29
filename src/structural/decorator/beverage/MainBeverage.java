package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast("Cà phê TN");

        beverage = new Milk("Sữa cô gái HL", beverage);
        beverage = new Soy("Đậu nành TS", 6, beverage);
        System.out.println("Lần 1");
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Milk("Sữa ông Thọ", beverage);
        beverage = new Soy("Đậu nành HL", 10, beverage);
        System.out.println("\nLần 2");
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Milk("Sữa Vinamilk", beverage);
        System.out.println("\nLần 3");
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());


    }
}
