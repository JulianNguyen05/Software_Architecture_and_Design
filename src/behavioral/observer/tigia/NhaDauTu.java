package behavioral.observer.tigia;

public abstract class NhaDauTu implements TiGia.TiGiaListener {
    TiGia tiGia;

    public NhaDauTu(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    // 2. 2 Phương thức phát sinh để demo
    public void dangKy(){
        tiGia.attach(this);
    }

    public void huyDangKy(){
        tiGia.detach(this);
    }

}
