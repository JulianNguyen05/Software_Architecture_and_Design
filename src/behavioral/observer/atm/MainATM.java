package behavioral.observer.atm;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account myAccount = new Account(atm, "trongdepzai", 1_000_000);

        myAccount.insertCard();

        atm.withDraw(5_00_000);

        System.out.println("--------------------------");

        atm.withDraw(6_000_000);

        System.out.println("--------------------------");

        myAccount.receiveCard();
    }
}
