import java.util.Arrays;

public class GiftSorter {
    public String sortGiftCode(String code){
        char[] codeArray = code.toCharArray();
        Arrays.sort(codeArray);
        return new String(codeArray);
    }
}
