package creational.state.atm;

public class ATM {
    public int balance;
    public int maxWithDraw = 10_000_000;
    IATM_State state;

    public ATM(int balance, int maxWithDraw) {
        this.balance = balance;
        this.maxWithDraw = maxWithDraw;
        changeState();
    }

    public IATM_State getState() {
        return state;
    }

    public void setState(IATM_State state) {
        this.state = state;
    }

    public void changeState(){
        if(balance <= 0){
            state = new NoMoney();
        }else if(balance < maxWithDraw){
            state = new Limited();
        }else{
            state = new Ready();
        }
    }

    public void moneyInt(int amount){
        state.moneyIntHandle(amount, this);
    }
    public void moneyOut(int amount){
        state.moneyOutHandle(amount, this);
    }
}
