package behavioral.observer.atm;

public interface ATM_Listener {
    public boolean checkBalance(int amount);
    public void message(int amount, boolean b);
}
