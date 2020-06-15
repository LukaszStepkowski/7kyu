public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) return null;
        String[] array = phrase.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1).toLowerCase();
        }
        return String.join(" ", array);
    }
}
