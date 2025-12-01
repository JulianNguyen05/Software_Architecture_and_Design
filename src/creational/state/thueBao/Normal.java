package creational.state.thueBao;

public class Normal implements IThueBaoState {

    private final int CUOC_GOI_MOI_GIAY = 1800 / 60;

    @Override
    public void napTienHanlde(int soTien, ThueBao thueBao) {
        System.out.println("=== Trạng thái: Thường ===");
        System.out.println("== Khuyến mãi: 0% ==");

        thueBao.balance += soTien;

        System.out.println("Đã nạp: " + soTien + "đ. Số dư mới: " + thueBao.balance + "đ");

        thueBao.changeState();
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao) {
        System.out.println("=== Trạng thái: Thường ===");

        int cuocGoi = soGiay * CUOC_GOI_MOI_GIAY; // 30 đồng/giây
        System.out.println("Phí cuộc gọi: " + cuocGoi + "đ");

        thueBao.balance -= cuocGoi;

        if (thueBao.balance < 0) {
            thueBao.balance = 0;
        }

        System.out.println("Số dư sau cuộc gọi: " + thueBao.balance + "đ");

        thueBao.changeState();
    }

    @Override
    public void printHandle(ThueBao thueBao) {
        System.out.println("=== Thông tin thuê bao ===");
        System.out.println("Trạng thái: Thường");
        System.out.println("Số dư: " + thueBao.balance + "đ");
        System.out.println("Thời gian gọi còn lại: " +
                thueBao.thoiGianGoi(thueBao.balance) + " giây");
    }

    @Override
    public int thoiGianGoiHandle(int soTien, ThueBao tb) {
        return soTien / CUOC_GOI_MOI_GIAY;
    }
}
