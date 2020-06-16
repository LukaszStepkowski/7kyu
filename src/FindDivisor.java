public class FindDivisor {
    public long numberOfDivisors(int n) {
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (n / i == i){
                    counter++;
                } else counter += 2;
            }
        }
        return counter;
    }
}
