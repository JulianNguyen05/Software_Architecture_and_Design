package structural.decorator.tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    List<String> tuDungs = Arrays.asList("và", "hoặc", "thì", "là", "mà", "nhưng", "tuy nhiên", "vì", "vậy", "do đó", "bởi vì", "sau đó", "trước khi", "khi", "nếu", "mặc dù", "ngay cả khi", "để", "nhằm", "với", "của", "trong", "trên", "dưới", "bên cạnh", "giữa", "từ", "đến", "cho", "bằng", "như", "như là", "hơn", "kém", "rất", "quá", "khá", "hơi", "chỉ", "cũng", "đã", "sẽ", "đang", "vẫn", "còn", "chưa", "không", "chẳng", "đừng", "chớ", "nào", "mấy", "bao nhiêu", "ai", "gì", "đâu", "khi nào", "tại sao", "thế nào", "vâng", "dạ", "ạ", "nhé", "nhỉ", "nhu", "đi", "thôi", "ngay", "luôn", "chắc", "có thể", "có lẽ", "hình như", "dường như", "hình như là", "dường như là", "tất cả", "cả", "mọi", "mỗi", "từng", "một số", "vài", "nhiều", "ít", "khác", "khác nhau", "tương tự", "giống", "giống như", "khác biệt", "đặc biệt", "riêng", "chung", "công cộng", "tư nhân", "chính", "phụ", "quan trọng", "cần thiết", "hữu ích", "có hại", "tốt", "xấu", "đẹp", "xấu xí", "to", "nhỏ", "dài", "ngắn", "cao", "thấp", "nặng", "nhẹ", "nhanh", "chậm", "mới", "cũ", "trẻ", "già", "nam", "nữ", "đàn ông", "đàn bà");

    public LoaiBoTuDung(ITokenize tokenize) {
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = super.tokenize();
        List<String> ketQua = new ArrayList<>();

        for (String s : tokens) {
            if (!tuDungs.contains(s.toLowerCase())) {
                ketQua.add(s);
            }
        }

        return ketQua;
    }
}
