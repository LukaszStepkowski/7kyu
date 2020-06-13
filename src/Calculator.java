public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        if (operation.equals("/") && numberTwo == 0) return null;
        if (operation.equals("*") && (numberOne == 0 || numberTwo == 0)) return 0.0;
        switch (operation){
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            case "/":
                return numberOne / numberTwo;
            default:
                return null;
        }
    }
}
