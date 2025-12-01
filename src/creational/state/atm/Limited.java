package creational.state.atm;

public class Limited implements IATM_State{
    @Override
    public void moneyIntHandle(int amount, ATM atm) {
        atm.balance += amount;
        System.out.println("Limited: Đã nạp " + amount + ". Số dư: " + atm.balance);
        atm.changeState();
    }

    @Override
    public void moneyOutHandle(int amount, ATM atm) {
        System.out.println("--- Trạng thái: Hạn Chế (Limited) ---");
        if (amount > atm.balance) {
            System.out.println("Lỗi: Máy đang ở chế độ hạn chế. Chỉ có thể rút tối đa: " + atm.balance);
        } else {
            atm.balance -= amount;
            System.out.println("Đã rút: " + amount + ". Số dư còn: " + atm.balance);
            atm.changeState();
        }
    }
}
