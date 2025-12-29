package creational.state.calculator;

public class InputState1 implements CaculatorState{
    @Override
    public void handleInput(Calculator context, String input) {
        try
        {
            context.setNum1(Double.parseDouble(input));
            System.out.println("Số thứ nhất: " + input);
            context.setState(new InputOperationState());
        } catch (NumberFormatException e){
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
        }
    }
}
