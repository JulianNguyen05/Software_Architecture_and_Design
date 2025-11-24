package behavioral.command.caculator;

public class CommandHandler {
    float result = 0;
    public void handle(char operator, float operand){
        float first_operand = result;
        switch (operator){
            case '+':
                result += operand;
                break;
            case '-':
                result -= operand;
                break;
            case '*':
                result *= operand;
                break;
            case '/':
                if(operand != 0){
                    result /= operand;
                }else{
                    System.out.println("Lỗi: Không thể chia cho 0");
                    return;
                }
                break;
            default:
                System.out.println("Lỗi: Không hợp lệ" + operator);
                return;
        }

        System.out.println(first_operand + " " + operator + " " + operand + " = " + result);
    }
}
