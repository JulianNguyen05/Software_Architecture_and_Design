package creational.state.thueBao;

public class ThueBao {
    String tenTB;
    public int balance;
    IThueBaoState state;

    public ThueBao(String tenTB, int balance, IThueBaoState state) {
        this.tenTB = tenTB;
        this.balance = balance;

        changeState();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        changeState();
    }

    public void changeState() {
        if (this.balance <= 100_000) {
            state = new Normal();
        } else if (this.balance <= 200_000) {
            state = new Silver();
        } else {
            state = new Gold();
        }
    }

    public void setState(IThueBaoState state) {
        this.state = state;
    }

    public void napTien(int soTien) {
        state.napTienHanlde(soTien, this);
        changeState(); // cập nhật state sau nạp tiền
    }

    public void thucHienCuocGoi(int soGiay) {
        state.thucHienCuocGoiHandle(soGiay, this);
        changeState(); // cập nhật state sau khi trừ tiền
    }

    public void print() {
        state.printHandle(this);
    }

    public int thoiGianGoi(int soTien) {
        return state.thoiGianGoiHandle(soTien, this);
    }
}
