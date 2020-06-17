import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] stringNumber = ("" + num).split("");
        return Integer.parseInt(Arrays.stream(stringNumber)
                .mapToInt(i -> Integer.valueOf(i))
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(i -> Integer.toString(i))
                .collect(Collectors.joining()));
    }
}
