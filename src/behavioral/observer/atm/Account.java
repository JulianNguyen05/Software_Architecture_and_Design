package behavioral.observer.atm;

public class Account implements ATM_Listener{
    private int balance;
    ATM atm;
    String name;

    public Account(ATM atm, String name, int balance) {
        this.balance = balance;
        this.atm = atm;
        this.name = name;
    }

    public void insertCard(){
        System.out.println(this.name + " đang đúc thẻ vào ATM....");
        atm.receiveCard(this);
    }

    public void receiveCard(){
        System.out.println(this.name + " bấm nút nhận lại thẻ...");
        atm.returnCard();
    }

    @Override
    public boolean checkBalance(int amount) {
        return this.balance >= amount;
    }

    @Override
    public void message(int amount, boolean b) {
        if (b) {
            this.balance -= amount;
            System.out.println("  -> [" + name + "] Rút tiền THÀNH CÔNG.");
            System.out.println("  -> [" + name + "] Số dư hiện tại: " + this.balance);
        } else {
            System.out.println("  -> [" + name + "] Rút tiền THẤT BẠI (Không đủ số dư).");
        }
    }
}
