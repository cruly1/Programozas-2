import java.util.stream.IntStream;
import java.lang.Math;

public class Main {
    private static double negyzetOsszeg() {
        return Math.pow(IntStream.range(1, 101)
                .sum(), 2);
    }

    private static double osszegNegyzet() {
        return IntStream.range(1, 101)
                .mapToDouble(num -> num * num)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(negyzetOsszeg() - osszegNegyzet());
    }
}
