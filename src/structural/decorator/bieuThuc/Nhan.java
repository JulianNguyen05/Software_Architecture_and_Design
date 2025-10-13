package structural.decorator.bieuThuc;

public class Nhan extends BieuThucDecorator{
    private float toanHang;

    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + ") * " + toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() * toanHang;
    }
}
