public class Arrays {
    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int index = 0;
        for (int i = 1; i < numbers.length; i++){
            if (numbers[index] > numbers[i]) index = i;
        }
        switch (toReturn){
            case "value":
                return java.util.Arrays.stream(numbers).sorted().findFirst().getAsInt();
            default:
                return index;
        }
    }
}
