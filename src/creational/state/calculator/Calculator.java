package creational.state.calculator;

public class Calculator {
    private CaculatorState state;
    private double num1, num2;
    private String operator;

    public Calculator() {
        state = new InputState1();
    }

    public void setState(CaculatorState state){
        this.state = state;
    }

    public void input(String data){
        state.handleInput(this, data);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
