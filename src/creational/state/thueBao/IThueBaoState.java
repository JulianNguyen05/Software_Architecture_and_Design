package creational.state.thueBao;

public interface IThueBaoState {
    void napTienHanlde(int soTien, ThueBao thueBao);
    void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao);
    void printHandle(ThueBao thueBao);
    int thoiGianGoiHandle(int soTien, ThueBao tb);
}
