package structural.decorator.bieuThuc;

public class Chia extends BieuThucDecorator{
    private int toanHang;

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + ") / " + toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() / toanHang;
    }
}
