public class Kata {
    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) return false;
        return str.substring(str.length() - ending.length(), str.length())
                .equals(ending);
    }
}
