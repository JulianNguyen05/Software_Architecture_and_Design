package behavioral.command.caculator;

import java.util.Stack;

public class CasioCaculator {
    Stack<ICommand> undos = new Stack<>();
    Stack<ICommand> redos = new Stack<>();
    CommandHandler handler = new CommandHandler();

    public void compute(char operator, float operand){
        ICommand command = new CaculatorCommand(operator, operand, handler);
        command.excute();
        redos.clear();
        undos.push(command);
    }

    public void undo(){
        if(!undos.empty()){
            ICommand command = undos.pop();
            redos.push(command);
            System.out.print("undo: ");
            command.unexcute();
        }
    }

    public void redo(){
        if(!redos.empty()){
            ICommand command = redos.pop();
            undos.push(command);
            System.out.print("redo: ");
            command.excute();
        }
    }

    public void clear(){
        handler.result = 0;
        undos.clear();
        redos.clear();
    }

}
