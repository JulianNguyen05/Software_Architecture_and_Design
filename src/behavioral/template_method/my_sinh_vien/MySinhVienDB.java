package behavioral.template_method.my_sinh_vien;

public class MySinhVienDB extends ObjectDB<MySinhVien>{
    @Override
    public int getId(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }
}
