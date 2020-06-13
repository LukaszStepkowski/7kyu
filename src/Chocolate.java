public class Chocolate {
    public static int breakChocolate(int n, int m) {
        if (n <= 1 && m <= 1) return 0;
        if (n == 1) return m - 1;
        if (m == 1) return n - 1;
        return (n - 1) + n * (m - 1);
    }
}
