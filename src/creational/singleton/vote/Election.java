package creational.singleton.vote;

public class Election {
    private static Election instance;
    private int trump = 0, biden = 0;

    private Election(){}

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate c){
        if(c == Candidate.JUMP){
            trump++;
        }else if(c == Candidate.BIDEN) {
            biden++;
        }
    }

    public void printRes(){
        System.out.println("TRUMP: " + trump);
        System.out.println("BIDEN: " + biden);
    }
}
