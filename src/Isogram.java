import java.util.Arrays;

public class Isogram {
    public static boolean  isIsogram(String str) {
        if (str.isEmpty()) return true;
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i++){
            if (charArray[i] != charArray[i+1]){
                continue;
            } else return false;
        }
        return true;
    }
}
