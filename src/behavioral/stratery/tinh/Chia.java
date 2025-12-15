package behavioral.stratery.tinh;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b) {
        if(b==0){
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        return a / b;
    }
}
