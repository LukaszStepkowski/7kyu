public class Kata2 {
    public static String reverseWords(final String original) {
        if (original.isBlank()) return original;
        String[] array = original.split(" ");
        String output = "";
        for (String string : array){
            StringBuilder sb = new StringBuilder(string);
            sb.reverse();
            output += sb.toString() + " ";
        }
        return output.trim();
    }
}
