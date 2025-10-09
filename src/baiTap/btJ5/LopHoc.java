package baiTap.btJ5;

import java.util.ArrayList;

public class LopHoc {
    private final QLDS qldsHS = new QLDS(new ArrayList<>());
    private final QLDS qldsGVGD = new QLDS(new ArrayList<>());

    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return qldsHS.getCaNhanList().size();
    }

    public int themGVGD(GiaoVien gv){
        qldsGVGD.them(gv);
        return qldsGVGD.getCaNhanList().size();
    }

    public int inDSHS(){
        System.out.println("\nDANH SÁCH HỌC SINH CỦA LỚP");
        System.out.println("----------------------------");
        qldsHS.inDS();
        return qldsHS.getCaNhanList().size();
    }

    public int inDSGVGD(){
        System.out.println("\nDANH SÁCH GIÁO VIÊN GIẢNG DẠY");
        System.out.println("----------------------------");
        qldsGVGD.inDS();
        return qldsGVGD.getCaNhanList().size();
    }
}
