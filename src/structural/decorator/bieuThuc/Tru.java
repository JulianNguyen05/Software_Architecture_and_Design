package structural.decorator.bieuThuc;

public class Tru extends BieuThucDecorator{
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + " - " + toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }
}
