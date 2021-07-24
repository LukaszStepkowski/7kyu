public class Square {
    public static boolean isSquare(int n) {
        if (n < 0) return false;
        if (n ==0) return true;
        double squareRoot = Math.sqrt(n);
        return (squareRoot - Math.floor(squareRoot) == 0);
    }
}
