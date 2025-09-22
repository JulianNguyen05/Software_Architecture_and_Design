package creational.factory.pizza.VietNam;

import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;
import creational.factory.pizza.PizzaType;

public class VietNamPizzaStore  extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type){
        switch (type){
            case HAISAN -> {
                return new PizzaHaiSan();
            }
        }
        return new PizzaHaiSan();
    }
}
