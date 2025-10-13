package baiTap.btA5;

import java.util.ArrayList;
import java.util.List;

public class QuyenSach {
    private String tuaDe, tacGia;
    private int soTrang;
    List<String> chuongs = new ArrayList<>();

    public QuyenSach(String tuaDe, String tacGia, int soTrang, List<String> chuongs) {
        this.tuaDe = tuaDe;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.chuongs = chuongs;
    }

    @Override
    public String toString() {
        return "QuyenSach{" +
                "tuaDe='" + tuaDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                ", chuongs=" + chuongs +
                '}';
    }
}
