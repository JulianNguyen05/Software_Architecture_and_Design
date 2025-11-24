package behavioral.command.caculator;

public class CaculatorCommand implements ICommand {
    char operator;
    float operand;
    CommandHandler handler;

    public CaculatorCommand(char operator, float operand, CommandHandler handler) {
        this.operator = operator;
        this.operand = operand;
        this.handler = handler;
    }

    @Override
    public void excute() {
        handler.handle(operator, operand);
    }

    @Override
    public void unexcute() {
        handler.handle(undoOperator(), operand);
    }

    private char undoOperator(){
        switch (operator){
            case '+':
                return '-';
            case '-':
                return '+';
            case '*':
                return '/';
            case '/':
                return '*';
            default:
                return ' ';
        }
    }
}
