public class BinaryCalculator {
    public static String calculate(final String n1, final String n2, final String o) {
        switch (o){
            case "add":
                return Integer.toString(Integer.valueOf(n1, 2) + Integer.valueOf(n2, 2), 2);
            case "subtract":
                return Integer.toString(Integer.valueOf(n1, 2) - Integer.valueOf(n2, 2), 2);
            default:
                return Integer.toString(Integer.valueOf(n1, 2) * Integer.valueOf(n2, 2), 2);
        }
    }
}
