package behavioral.observer.tigia;

public class NhaDauTuA extends NhaDauTu {
    public NhaDauTuA(TiGia tiGia) {
        super(tiGia);
    }

    @Override
    public void listen(float delta) {
        if (delta >= 0){
            System.out.println("Nhà đầu tư A: Bán ra");
        }else{
            System.out.println("Nhà đầu tư A: Gom vào");
        }
    }
}
