import java.util.ArrayList;
import java.util.List;

class WordSearch {
    static String[] findWord(String x, String[] y){
        List<String> result = new ArrayList<>();
        for (String word : y) {
            if (word.toLowerCase().contains(x.toLowerCase())) result.add(word);
        }
        if (result.size() > 0) {
            return result.toArray(String[]::new);
        } else return new String[]{"Empty"};
    }
}