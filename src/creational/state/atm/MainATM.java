package creational.state.atm;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM(100_000_000, 50_000_000);
        atm.moneyOut(40_000_000);
        atm.moneyOut(40_000_000);
        atm.moneyOut(10_000_000);
        atm.moneyInt(10_000_000);
        atm.moneyOut(20_000_000);
        atm.moneyOut(10_000_000);
    }
}
