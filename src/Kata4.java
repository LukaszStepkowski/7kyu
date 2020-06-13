public class Kata4 {
    public static String[] capMe(String[] strings) {
        String[] opt = new String[strings.length];
        for (int i = 0; i < strings.length; i++){
            opt[i] = strings[i].substring(0,1).toUpperCase() + strings[i].substring(1).toLowerCase();
        }
        return opt;
    }
}
