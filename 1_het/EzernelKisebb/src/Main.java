import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 1000)
                .filter(szam -> szam % 3 == 0 || szam % 5 == 0)
                .forEach(System.out::println);
    }
}
