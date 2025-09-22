package creational.factory.pizza;

import creational.factory.pizza.VietNam.VietNamPizzaStore;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore ps = new VietNamPizzaStore();
        Pizza p = ps.orderPizza(PizzaType.HAISAN);
        System.out.println(p.toString());
    }
}
