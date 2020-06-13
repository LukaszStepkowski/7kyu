import java.util.function.IntUnaryOperator;

public class Kata5 {
    public static IntUnaryOperator add(int n) {
        return i -> i + n;
    }
}
