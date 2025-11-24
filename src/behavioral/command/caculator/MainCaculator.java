package behavioral.command.caculator;

public class MainCaculator {
    public static void main(String[] args) {
        CasioCaculator caculator = new CasioCaculator();
        caculator.compute('+', 100);
        caculator.compute('-', 20);
        caculator.compute('/', 4);
        caculator.undo();
        caculator.undo();
        caculator.undo();
        caculator.undo();
        caculator.redo();
    }
}
