package creational.singleton.vidu;

public class MainMySingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.increase();
        s1.increase();
        s2.increase();
        s1.increase();
    }
}
