import java.util.Arrays;

public class Kata3 {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) return false;
        char testArr[] = test.toLowerCase().toCharArray();
        char originalArr[] = original.toLowerCase().toCharArray();
        Arrays.sort(testArr);
        Arrays.sort(originalArr);
        return Arrays.equals(testArr, originalArr);
    }
}
