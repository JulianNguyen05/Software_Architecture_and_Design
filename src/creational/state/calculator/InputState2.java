package creational.state.calculator;

public class InputState2 implements CaculatorState{
    @Override
    public void handleInput(Calculator context, String input) {
        try {
            context.setNum2(Double.parseDouble(input));
            System.out.println("Số thứ hai: " + input);
            context.setState(new OperateState());
            context.input("");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
        }
    }
}
