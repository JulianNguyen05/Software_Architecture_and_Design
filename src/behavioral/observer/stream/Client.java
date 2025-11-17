package behavioral.observer.stream;

import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>>{
    MyStream stream;
    String name;

    public Client(MyStream stream, String name) {
        this.stream = stream;
        this.name = name;
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println(name);
        for (MonHoc monHoc : monHocs) {
            System.out.println(monHoc.toString());
        }
    }
}
