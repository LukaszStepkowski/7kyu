public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] opt = new int[Math.abs(n) + 1];
        int sign = 1;
        if (n < 0) sign = -1;
        opt[0] = 0;
        for (int i = 1; i < opt.length; i++){
            opt[i] = (i + Math.abs(opt[i - 1])) * sign;
        }
        return opt;
    }
}
