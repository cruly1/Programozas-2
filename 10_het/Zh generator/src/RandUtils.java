import java.util.List;
import java.util.Random;

public class RandUtils {
    private final static Random r = new Random();

    private RandUtils() {}

    public static int randrange(int also, int felso) {
        return randint(also, felso-1);
    }

    public static int randint(int also, int felso) {
        return also + r.nextInt(felso - also + 1);
    }

    public static int choice(List<Integer> lista) {
        return lista.get(randrange(0, lista.size()));
    }
}
