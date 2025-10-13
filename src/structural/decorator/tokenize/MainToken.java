package structural.decorator.tokenize;

import java.util.List;

public class MainToken {
    public static void main(String[] args) {
        String s = "Yasuo sinh ra ở Ionia, vùng đất của kiếm đạo, gió và sự hài hòa. Từ nhỏ, anh là một kiếm sĩ tài năng nhưng cũng ngạo mạn, bướng bỉnh. Trong học viện kiếm thuật, Yasuo được huấn luyện cùng anh trai Yone, người luôn điềm tĩnh và có kỷ luật hơn.\n" +
                "\n" +
                "Dù có năng khiếu thiên bẩm, Yasuo lại thường chống đối thầy dạy, chỉ nghe theo bản năng. Nhưng mọi người phải công nhận — anh có thể cảm nhận được gió và khiến nó nghe lời mình.";

        ITokenize t = new TachTu(s);
        t = new LoaiBoDauCau(t);

        List<String> result = t.tokenize();
        System.out.println(result);
    }
}
