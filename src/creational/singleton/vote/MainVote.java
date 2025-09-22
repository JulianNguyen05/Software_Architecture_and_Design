package creational.singleton.vote;

public class MainVote {
    public static void main(String[] args) {
        User trong = new User("Trong");
        User julian = new User("Julian");
        User trongdepzai = new User("Trongdepzai");

        trong.vote(Candidate.JUMP);
        julian.vote(Candidate.BIDEN);
        trongdepzai.vote(Candidate.BIDEN);
        trongdepzai.vote(Candidate.JUMP);

        Election.getInstance().printRes();
        trongdepzai.vote(Candidate.BIDEN );
        Election.getInstance().printRes();
    }
}