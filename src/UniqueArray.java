import java.util.Arrays;

public class UniqueArray {
    public static int[] unique(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}
