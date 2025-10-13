package structural.decorator.tokenize;

import java.util.List;

public class MainToken {
    public static void main(String[] args) {
        String text = """
                Yasuo sinh ra ở Ionia, vùng đất của kiếm đạo, gió và sự hài hòa. 
                Từ nhỏ, anh là một kiếm sĩ tài năng nhưng cũng ngạo mạn, bướng bỉnh. 
                Trong học viện kiếm thuật, Yasuo được huấn luyện cùng anh trai Yone, 
                người luôn điềm tĩnh và có kỷ luật hơn.
                Dù có năng khiếu thiên bẩm, Yasuo lại thường chống đối thầy dạy, 
                chỉ nghe theo bản năng. Nhưng mọi người phải công nhận — 
                anh có thể cảm nhận được gió và khiến nó nghe lời mình.
                """;

        // Khởi tạo tokenizer gốc
        ITokenize tokens = new TachTu(text);

        // In ra kết quả ban đầu (tách từ)
        System.out.println("👉 Sau khi tách từ:");
        System.out.println(tokens.tokenize());

        // Loại bỏ dấu câu
        tokens = new LoaiBoDauCau(tokens);
        System.out.println("\n👉 Sau khi loại bỏ dấu câu:");
        System.out.println(tokens.tokenize());

        // Loại bỏ từ dư (và, là, mà, thì, hoặc...)
        tokens = new LoaiBoTuDung(tokens);
        System.out.println("\n👉 Sau khi loại bỏ từ dư:");
        List<String> result = tokens.tokenize();
        System.out.println(result);
    }
}
