package creational.factory.pizza.VietNam;

import creational.factory.pizza.Pizza;

public class PizzaHaiSan extends Pizza {
    @Override
    public void prepare() {
        this.getBuilder().append("Chuẩn bị bột, 4 con cá cơm, nước mắm");
    }

    @Override
    public void bake(){
        this.getBuilder().append("\nNướng trên lò than 20 phút");
    }

    @Override
    public void cut(){
        this.getBuilder().append("\nCắt làm 4 miếng");
    }

    @Override
    public void box() {
        this.getBuilder().append("\nGói bằng lá chuối, bỏ vào hộp");
    }
}

