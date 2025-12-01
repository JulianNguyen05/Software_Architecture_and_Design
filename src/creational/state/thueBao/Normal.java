package creational.state.thueBao;

public class Normal implements IThueBaoState{
    @Override
    public void napTienHanlde(int soTien, ThueBao thueBao) {
        System.out.println("===Trạng thái: Thường===");
        System.out.println("==Khuyến mãi: 0%");
        thueBao.balance += soTien;
        System.out.println("Đã nạp: " + soTien + ". Số dư: " + thueBao.balance);
        thueBao.changeState();
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao) {
        int cuocGoi = soGiay*(1800/60);
        thueBao.balance -= cuocGoi;

        thueBao.balance = thueBao.balance<cuocGoi ? 0 : thueBao.balance - cuocGoi;
        System.out.println("===Trạng thái: Thường===");
        System.out.println("Số dư: " + thueBao.balance);
    }

    @Override
    public void printHandle(ThueBao thueBao) {
        System.out.println("Trạng thái: Thường");
        System.out.println("Số dư: " + thueBao.balance);
        System.out.println("Thời gian gọi còn lại: " + thueBao.thoiGianGoi(thueBao.balance) + " giây");
    }

    @Override
    public int thoiGianGoiHandle(int soTien, ThueBao tb) {
        return soTien;
    }
}
