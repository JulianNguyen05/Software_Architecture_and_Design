package creational.state.thueBao;

public class Silver implements IThueBaoState{
    @Override
    public void napTienHanlde(int soTien, ThueBao thueBao) {
        System.out.println("===Trạng thái: Bạc===");
        System.out.println("==Khuyến mãi: 5%");
        int tienKhuyenMai = (int)(soTien * 0.05f);
        int tongTienNap = soTien + tienKhuyenMai;

        thueBao.balance += tongTienNap;

        System.out.println("Đã nạp: " + soTien + " + " + tienKhuyenMai + " (KM).");
        System.out.println("Số dư hiện tại: " + thueBao.balance);
        thueBao.changeState();
    }

    @Override
    public void thucHienCuocGoiHandle(int soGiay, ThueBao thueBao) {
        int cuocGoi = soGiay*(1500/60);
        if(thueBao.balance - soGiay*cuocGoi>=100_000){
            thueBao.balance -= soGiay*cuocGoi;
            System.out.println("===Trạng thái: Bạc===");
            System.out.println("Số dư: " + thueBao.balance);
        }else{
            int tgBac = 0;
            for(;;){
                tgBac++;
                thueBao.balance -= cuocGoi;
                if(thueBao.balance<=100_000){
                    break;
                }
                thueBao.setState(new Normal());
                thueBao.thucHienCuocGoi(soGiay - tgBac);
            }
        }
    }

    @Override
    public void printHandle(ThueBao thueBao) {
        System.out.println("===Trạng thái: Bạc===");
        System.out.println("Số dư: " + thueBao.balance);
        System.out.println("Thời gian gọi còn lại: " + thueBao.thoiGianGoi(thueBao.balance) + " giây");
    }

    @Override
    public int thoiGianGoiHandle(int soTien, ThueBao tb) {
        int tgBac = 0;
        int giaCuoc = 1500/60;
        int soDu = soTien;
        for(;;) {
            tgBac++;
            soDu -= giaCuoc;
            if (soDu <= 100_000)
                break;
        }
        tb.setState(new Normal());
        int tgThuong = tb.thoiGianGoi(soDu);
        tb.setState(new Silver());
        return tgThuong + tgBac;
    }
}
