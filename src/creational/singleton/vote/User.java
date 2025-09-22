package creational.singleton.vote;

public class User {
    private String id;

    public void vote(Candidate c){
        Election.getInstance().vote(c);
    }
}
