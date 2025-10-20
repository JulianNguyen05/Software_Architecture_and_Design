package behavioral.observer.tigia;

public class NhaDauTuB extends NhaDauTu{
    public NhaDauTuB(TiGia tiGia) {
        super(tiGia);
    }

    @Override
    public void listen(float delta) {
        if (delta >= 0){
            System.out.println("Nhà đầu tư B: Gom vào");
        }else{
            System.out.println("Nhà đầu tư B: Bán ra");
        }
    }
}
