public class Triangular {
    public static int triangular(int n) {
        if (n <= 0) return 0;
        return n + triangular(n - 1);
    }
}
