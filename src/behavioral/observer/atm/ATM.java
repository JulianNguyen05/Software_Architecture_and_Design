package behavioral.observer.atm;

import java.util.List;

public class ATM {
    ATM_Listener account;

    public void receiveCard(ATM_Listener account){
        this.account = account;
        System.out.println("ATM đã nhận thẻ");
    }

    public void returnCard(){
        this.account = null;
        System.out.println("ATM đã trả thẻ");
    }

    public void withDraw(int amount){
        if(account == null){
            System.out.println("ATM lỗi");
        }

        System.out.println("[ATM] Đang xử lý yêu cầu rút " + amount + "...");

        boolean isBalanceEnough = account.checkBalance(amount);

        account.message(amount, isBalanceEnough);
    }
}
