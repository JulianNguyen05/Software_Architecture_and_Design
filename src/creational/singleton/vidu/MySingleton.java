package creational.singleton.vidu;

public class MySingleton {
    private static MySingleton instance;
    int count;
    private MySingleton() {

    }
    public static MySingleton getInstance() {
        if (instance == null)
            instance = new MySingleton();
        return instance;
    }
    public void increase(){
        System.out.println(++count);
    }
}
