package creational.state.calculator;

public class InputOperationState implements CaculatorState{
    @Override
    public void handleInput(Calculator context, String input) {
        if (input.matches("[+\\-*/]")) {
            context.setOperator(input);
            System.out.println("Toán tử: " + input);
            context.setState(new InputState2());
        } else {
            System.out.println("Lỗi: Toán tử không hợp lệ. Thử lại (+, -, *, /): ");
        }
    }
}
