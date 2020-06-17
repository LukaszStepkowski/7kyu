import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(Arrays.stream(Integer.toString(n).split(""))
                .mapToInt(Integer::valueOf)
                .map(i -> (int)Math.pow(i, 2))
                .mapToObj(i -> Integer.toString(i))
                .collect(Collectors.joining()));
    }
}
