public class ReverseLonger {
    public static String shorterReverseLonger(String a, String b) {
        StringBuilder sb = new StringBuilder();
        if (b.length() > a.length()){
            return a + sb.append(b).reverse().toString() + a;
        } else {
            return b + sb.append(a).reverse().toString() + b;
        }
    }
}
