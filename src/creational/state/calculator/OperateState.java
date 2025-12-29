package creational.state.calculator;

public class OperateState implements CaculatorState{
    @Override
    public void handleInput(Calculator context, String input) {
        double res = 0;
        switch (context.getOperator()) {
            case "+": res = context.getNum1() + context.getNum2(); break;
            case "-": res = context.getNum1() - context.getNum2(); break;
            case "*": res = context.getNum1() * context.getNum2(); break;
            case "/":
                if(context.getNum2() == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                    context.setState(new InputState1());
                    return;
                }
                res = context.getNum1() / context.getNum2();
                break;
        }
        System.out.println("==> Kết quả: " + res);
        System.out.println("---------------------------");
        context.setState(new InputState1());
    }
}
