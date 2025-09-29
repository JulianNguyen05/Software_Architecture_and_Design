package creational.singleton.dataAccess;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> sps = new ArrayList<>();

    private DataAccess(){}

    public static DataAccess getInstance(){
        if (instance == null){
            instance = new DataAccess();
        }
        return instance;
    }

    public void add (SanPham sp){
        sps.add(sp);
    }

    public void display(){
        for(var s : sps){
            System.out.println(s.toString());
        }
    }

}
