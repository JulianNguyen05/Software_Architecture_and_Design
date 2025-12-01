package creational.state.thueBao;

public class Silver implements IThueBaoState {

    private final int CUOC_GOI_MOI_GIAY = 1500 / 60;
    private final int NGUONG_XUONG_NORMAL = 100_000;

    @Override
    public void napTienHanlde(int soTien, ThueBao thueBao) {
        System.out.println("=== Trạng thái: Bạc ===");
        System.out.println("== Khuyến mãi: 5% ==");

        int tienKhuyenMai = (int) (soTien * 0.05f);
        int tongTienNap = soTien + tienKhuyenMai;

        thueBao.balance += tongTienNap;

        System.out.println("Đã nạp: " + soTien + " + " + tienKhuyenMai + " (KM)");
        System.out.println("Số dư hiện tại: " + thueBao.balance);

        thueBao.changeState();
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao) {
        System.out.println("=== Trạng thái: Bạc ===");

        int cuocGoi = soGiay * CUOC_GOI_MOI_GIAY;

        thueBao.balance -= cuocGoi;

        if (thueBao.balance < 0) {
            thueBao.balance = 0;
        }

        System.out.println("Phí cuộc gọi: " + cuocGoi + "đ");
        System.out.println("Số dư sau cuộc gọi: " + thueBao.balance + "đ");

        if (thueBao.balance <= NGUONG_XUONG_NORMAL) {
            System.out.println("Số dư dưới 100.000đ → Chuyển sang trạng thái Thường!");
            thueBao.setState(new Normal());
        }
    }

    @Override
    public void printHandle(ThueBao thueBao) {
        System.out.println("=== Trạng thái: Bạc ===");
        System.out.println("Số dư: " + thueBao.balance + "đ");
        System.out.println("Thời gian gọi còn lại: " +
                thueBao.thoiGianGoi(thueBao.balance) + " giây");
    }

    @Override
    public int thoiGianGoiHandle(int soTien, ThueBao tb) {

        int soDu = soTien;
        int tgBac = 0;

        while (soDu > NGUONG_XUONG_NORMAL) {
            soDu -= CUOC_GOI_MOI_GIAY;
            tgBac++;

            if (soDu <= NGUONG_XUONG_NORMAL)
                break;
        }

        int tgThuong = soDu / (1800 / 60);

        return tgBac + tgThuong;
    }
}
