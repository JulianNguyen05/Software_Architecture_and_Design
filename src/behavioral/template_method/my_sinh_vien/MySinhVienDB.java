package behavioral.template_method.my_sinh_vien;

public class MySinhVienDB extends ObjectDB<MySinhVien>{
    @Override
    public int getId(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }

    @Override
    MySinhVien findByID(int id) {
        return super.findByID(id);
    }

    @Override
    public void add(MySinhVien mySinhVien) {
        super.add(mySinhVien);
    }

    @Override
    public void update(MySinhVien mySinhVien) {
        super.update(mySinhVien);
    }

    @Override
    public void deleteByID(int id) {
        super.deleteByID(id);
    }
}
