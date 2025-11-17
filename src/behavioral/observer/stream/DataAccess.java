package behavioral.observer.stream;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private List<MonHoc> listMH = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc m){
        listMH.add(m);
        stream.addEvent(listMH);
    }

    public void delete(MonHoc m){}
}
