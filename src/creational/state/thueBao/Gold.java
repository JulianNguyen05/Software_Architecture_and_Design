package creational.state.thueBao;

public class Gold implements IThueBaoState{
    @Override
    public void napTienHanlde(int soTien, ThueBao thueBao) {
        System.out.println("===Trạng thái: Vàng===");
        System.out.println("==Khuyến mãi: 10%");
        int tienKhuyenMai = (int)(soTien * 0.1f);
        int tongTienNap = soTien + tienKhuyenMai;

        thueBao.balance += tongTienNap;

        System.out.println("Đã nạp: " + soTien + " + " + tienKhuyenMai + " (KM).");
        System.out.println("Số dư hiện tại: " + thueBao.balance);
        thueBao.changeState();
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao) {
        int cuocGoi = soGiay*(1200/60);
        if(thueBao.balance - soGiay*cuocGoi>200_000){
            thueBao.balance -= soGiay*cuocGoi;
            System.out.println("===Trạng thái: Vàng===");
            System.out.println("Số dư: " + thueBao.balance);
        }else{
            int tgVang = 0;
            for(;;){
                tgVang++;
                thueBao.balance -= cuocGoi;
                if(thueBao.balance<=200_000){
                    break;
                }
                thueBao.setState(new Normal());
                thueBao.thucHienCuocGoi(soGiay - tgVang);
            }
        }
    }

    @Override
    public void printHandle(ThueBao thueBao) {
        System.out.println("===Trạng thái: Vàng===");
        System.out.println("Số dư: " + thueBao.balance);
        System.out.println("Thời gian gọi còn lại: " + thueBao.thoiGianGoi(thueBao.balance) + " giây");
    }

    @Override
    public int thoiGianGoiHandle(int soTien, ThueBao tb) {
        int tgVang = 0;
        int giaCuoc = 1500/60;
        int soDu = soTien;
        for(;;) {
            tgVang++;
            soDu -= giaCuoc;
            if (soDu <= 100_000)
                break;
        }
        tb.setState(new Silver());
        int tgThuong = tb.thoiGianGoi(soDu);
        tb.setState(new Gold());
        return tgThuong + tgVang;
    }
}
