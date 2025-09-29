package creational.builder.quyen_sach;

import creational.builder.hoa_don.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class QuyenSach {
    String tuaDe;
    int soTrang;
    String tacGia;
    List<String> dscc;

    public QuyenSach(String tuaDe, int soTrang, String tacGia, List<String> dscc) {
        this.tuaDe = tuaDe;
        this.soTrang = soTrang;
        this.tacGia = tacGia;
        this.dscc = dscc;
    }

    @Override
    public String toString() {
        return "QuyenSach{" +
                "tuaDe='" + tuaDe + '\'' +
                ", soTrang=" + soTrang +
                ", tacGia='" + tacGia + '\'' +
                ", dscc=" + dscc +
                '}';
    }

    public static class Builder{
        String tuaDe;
        int soTrang;
        String tacGia;
        List<String> dscc = new ArrayList<>();

        public Builder buildTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }

        public Builder buildSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }

        public Builder buildTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }

        public Builder addChuong(String chuong) {
            this.dscc.add(chuong);
            return this;
        }

        public Builder buildDscc(List<String> dscc) {
            this.dscc.addAll(dscc);
            return this;
        }

        public QuyenSach build() {
            return new QuyenSach(tuaDe, soTrang, tacGia, dscc);
        }
    }
}
