package creational.state.calculator;

public class MainCaculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("--- Thực hiện phép tính: 10 + 5 ---");
        calculator.input("10");
        calculator.input("+");
        calculator.input("5");

        System.out.println("--- Thực hiện phép tính: 20 * 4 ---");
        calculator.input("20");
        calculator.input("*");
        calculator.input("4");

    }
}
