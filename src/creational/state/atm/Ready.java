package creational.state.atm;

public class Ready implements IATM_State{
    @Override
    public void moneyIntHandle(int amount, ATM atm) {
        atm.balance += amount;
        System.out.println("Ready: Đã nạp " + amount + ". Số dư: " + atm.balance);
        atm.changeState();
    }

    @Override
    public void moneyOutHandle(int amount, ATM atm) {
        System.out.println("--- Trạng thái: Sẵn Sàng (Ready) ---");
        if(amount > atm.maxWithDraw){
            System.out.println("Lỗi: Số tiền vượt quá hạn mức rút (" + atm.maxWithDraw + ")");
        }else if(amount > atm.balance){
            System.out.println("Lỗi: Không đủ tiền!");
        }else{
            atm.balance -= amount;
            System.out.println("Đã rút: " + amount + ". Số dư còn: " + atm.balance);
            atm.changeState();
        }
    }
}
