package baiTap.btA4;

public class MainBtA4 {
    public static void main(String[] args) {
        User u1 = new User("Alice");
        User u2 = new User("Bob");
        User u3 = new User("Charlie");

        u1.vote("Trump");
        u2.vote("Biden");
        u3.vote("Trump");
        u1.vote("Biden");

        Election.getInstance().showResult();
    }
}
