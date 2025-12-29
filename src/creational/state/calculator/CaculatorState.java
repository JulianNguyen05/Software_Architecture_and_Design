package creational.state.calculator;

public interface CaculatorState {
    void handleInput(Calculator context, String input);
}
