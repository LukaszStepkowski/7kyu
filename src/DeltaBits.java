public class DeltaBits {
    public static int convertBits(int a, int b) {
        int counter = 0;
        for(int i = 0; i <= 16; i++){
            if (((a >> i) & 1) != ((b >> i) & 1)) {
                counter++;
            }
        }
        return counter;
    }
}
