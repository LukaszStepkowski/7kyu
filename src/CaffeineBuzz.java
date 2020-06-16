public class CaffeineBuzz {
    public static String caffeineBuzz(int n){
        String opt = "";
        if (n % 3 == 0 && n % 4 == 0){
            opt += "Coffee";
        } else if (n % 3 == 0) {
            opt += "Java";
        } else opt += "mocha_missing!";
        if (n % 3 == 0 && n % 2 == 0) opt += "Script";
        return opt;
    }
}
