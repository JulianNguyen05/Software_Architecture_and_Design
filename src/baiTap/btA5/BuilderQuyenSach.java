package baiTap.btA5;

import java.util.ArrayList;
import java.util.List;

public class BuilderQuyenSach {
    private String tuaDe, tacGia;
    private int soTrang;
    List<String> chuongs = new ArrayList<>();

    public BuilderQuyenSach setTuaDe(String tuaDe) {
        this.tuaDe = tuaDe;
        return this;
    }

    public BuilderQuyenSach setTacGia(String tacGia) {
        this.tacGia = tacGia;
        return this;
    }

    public BuilderQuyenSach setSoTrang(int soTrang) {
        this.soTrang = soTrang;
        return this;
    }

    public BuilderQuyenSach addChuong(String chuong) {
        this.chuongs.add(chuong);
        return this;
    }

    public BuilderQuyenSach setDscc(List<String> dscc) {
        this.chuongs.addAll(dscc);
        return this;
    }

    public QuyenSach build(){
        return new QuyenSach(tuaDe, tacGia, soTrang, chuongs);
    }
}
