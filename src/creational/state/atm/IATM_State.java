package creational.state.atm;

public interface IATM_State {
    public void moneyIntHandle(int amount, ATM atm);
    public void moneyOutHandle(int amount, ATM atm);
}
