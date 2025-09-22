package creational.singleton.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int trump = 0, biden = 0;
    List<String> votedUsers = new ArrayList<>();

    private Election(){}

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate c, String id){
        for(var u : votedUsers){
            if(u.equals(id)){
                return;
            }
        }
        if(c == Candidate.JUMP){
            trump++;
        }else if(c == Candidate.BIDEN) {
            biden++;
        }

        votedUsers.add(id);
    }

    public void printRes(){
        System.out.println("TRUMP: " + trump);
        System.out.println("BIDEN: " + biden);
    }
}
