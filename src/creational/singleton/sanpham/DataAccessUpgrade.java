package creational.singleton.sanpham;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade>
            instances = new Hashtable<>();

    List<SanPham> sps = new ArrayList<>();

    private DataAccessUpgrade(){}

    public static DataAccessUpgrade getInstance(String tag){
        if(instances.get(tag) == null)
            instances.put(tag, new DataAccessUpgrade());
        return instances.get(tag);
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
