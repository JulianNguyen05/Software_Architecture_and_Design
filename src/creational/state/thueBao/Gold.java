package creational.state.thueBao;

public class Gold implements IThueBaoState {

    private final int CUOC_GOI_MOI_GIAY = 1200 / 60;
    private final int NGUONG_XUONG_SILVER = 200_000;

    @Override
    public void napTienHanlde(int soTien, ThueBao thueBao) {
        System.out.println("=== Trạng thái: Vàng ===");
        System.out.println("== Khuyến mãi: 10% ==");

        int tienKM = (int)(soTien * 0.1f);
        int tongNap = soTien + tienKM;

        thueBao.balance += tongNap;

        System.out.println("Đã nạp: " + soTien + " + " + tienKM + " (KM)");
        System.out.println("Số dư hiện tại: " + thueBao.balance);

        thueBao.changeState();
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao) {
        System.out.println("=== Trạng thái: Vàng ===");

        int cuoc = soGiay * CUOC_GOI_MOI_GIAY;
        thueBao.balance -= cuoc;

        if (thueBao.balance < 0)
            thueBao.balance = 0;

        System.out.println("Phí cuộc gọi: " + cuoc + "đ");
        System.out.println("Số dư sau cuộc gọi: " + thueBao.balance + "đ");

        if (thueBao.balance <= NGUONG_XUONG_SILVER) {
            System.out.println("Số dư dưới 200.000đ → Chuyển sang trạng thái Bạc!");
            thueBao.setState(new Silver());
        }
    }

    @Override
    public void printHandle(ThueBao thueBao) {
        System.out.println("=== Trạng thái: Vàng ===");
        System.out.println("Số dư: " + thueBao.balance + "đ");
        System.out.println("Thời gian gọi còn lại: " +
                thueBao.thoiGianGoi(thueBao.balance) + " giây");
    }

    @Override
    public int thoiGianGoiHandle(int soTien, ThueBao tb) {

        int soDu = soTien;
        int tgVang = 0;

        while (soDu > NGUONG_XUONG_SILVER) {
            soDu -= CUOC_GOI_MOI_GIAY;
            tgVang++;

            if (soDu <= NGUONG_XUONG_SILVER)
                break;
        }

        int tgSilver = soDu / (1500 / 60);

        int soDuCuoi = soDu % (1500 / 60);

        int tgNormal = soDuCuoi / (1800 / 60);

        return tgVang + tgSilver + tgNormal;
    }
}
