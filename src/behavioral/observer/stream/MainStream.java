package behavioral.observer.stream;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client client1 = new Client(stream, "client1");
        Client client2 = new Client(stream, "client2");
        System.out.println("Lần 1");
        dataAccess.add(new MonHoc("1", "q", 1));
        dataAccess.add(new MonHoc("2", "q", 1));
        System.out.println("Lần 2");
        dataAccess.add(new MonHoc("3", "q", 1));
        dataAccess.add(new MonHoc("4", "q", 1));
    }
}
