public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        int opt = 0;
        for (int i = 0; i <= digits.length() - 5; i++){
            if (opt < Integer.valueOf(digits.substring(i, i+ 5))){
                opt = Integer.valueOf(digits.substring(i, i+ 5));
            }
        }
        return opt;
    }
}
