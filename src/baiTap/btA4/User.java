package baiTap.btA4;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void vote(String candidate) {
        Election election = Election.getInstance();
        election.vote(name, candidate);
    }
}
