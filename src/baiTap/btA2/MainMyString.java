package baiTap.btA2;

public class MainMyString {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();

        String result = builder
                .addString("Tổng tiền: ")
                .addFloat(123.45f)
                .addString(" VND - Đã thanh toán: ")
                .addBool(true)
                .toString();

        System.out.println(result);
    }
}
