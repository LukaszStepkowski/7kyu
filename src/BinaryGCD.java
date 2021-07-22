import java.math.BigInteger;

public class BinaryGCD {
    public static int gcdBinary(int x, int y) {
        if (x == 0 && y == 0) return 0;
        int result = new BigInteger(String.valueOf(x)).gcd(new BigInteger(String.valueOf(y))).intValue();
        return Integer.bitCount(result);
    }
}
