package baiTap.btA4;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private static Election instance;
    private int votesBiden, votesTrump;
    private Set<String> votedUsers = new HashSet<>();

    public Election() {
    }

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    public void vote(String userName, String candidate) {
        if (votedUsers.contains(userName)) {
            System.out.println(userName + " đã bầu rồi, không thể bầu lại!");
            return;
        }

        if (candidate.equalsIgnoreCase("Trump")) {
            votesTrump++;
            System.out.println(userName + " bầu cho Donald Trump!");
        } else if (candidate.equalsIgnoreCase("Biden")) {
            votesBiden++;
            System.out.println(userName + " bầu cho Joe Biden!");
        } else {
            System.out.println("Ứng viên không hợp lệ!");
            return;
        }

        votedUsers.add(userName);
    }

    public void showResult() {
        System.out.println("===== KẾT QUẢ BẦU CỬ =====");
        System.out.println("Donald Trump: " + votesTrump + " phiếu");
        System.out.println("Joe Biden: " + votesBiden + " phiếu");
    }
}
