public class PalindromeChainLength {
    public static int palindromeChainLength (long n) {
        int counter = 0;
        long reversedNumber = (Long.parseLong(new StringBuilder(n + "").reverse().toString()));
        while (reversedNumber != n) {
            n += reversedNumber;
            reversedNumber = (Long.parseLong(new StringBuilder(n + "").reverse().toString()));
            counter ++;
        }
        return counter;
    }
}
