import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Randint: " + RandUtils.randint(5, 10));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("RandRange: " + RandUtils.randrange(15, 20));
        }

        int result = RandUtils.choice(List.of(1, 2, 3, 4, 5, 6));

        System.out.println("Choice: " + result);
    }
}
