package creational.state.atm;

public class NoMoney implements IATM_State{
    @Override
    public void moneyIntHandle(int amount, ATM atm) {
        atm.balance += amount;
        System.out.println("NoMoney: Đã nạp " + amount + ". Máy đã có tiền trở lại.");
        atm.changeState();
    }

    @Override
    public void moneyOutHandle(int amount, ATM atm) {
        System.out.println("--- Trạng thái: Hết Tiền (NoMoney) ---");
        System.out.println("Giao dịch bị từ chối: Máy ATM hiện không còn tiền.");
    }
}
