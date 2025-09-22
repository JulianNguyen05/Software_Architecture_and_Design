package creational.singleton.vote;

public class User {
    private String id;

    public User(String id) {
        this.id = id;
    }

    public void setId(String id){
        this.id = id;
    }

    public void vote(Candidate c){
        Election.getInstance().vote(c, this.id);

    }
}
