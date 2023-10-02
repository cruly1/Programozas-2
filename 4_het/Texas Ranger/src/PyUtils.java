import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PyUtils {
    private PyUtils() {}

    public static List<Integer> range(int also, int felso) {
        List<Integer> lista = new ArrayList();

        for (int i = also; i < felso; i++) {
            lista.add(i);
        }

        return lista;
    }

    public static List<Integer> range(int felso) {
        List<Integer> lista = new ArrayList();

        for (int i = 0; i < felso; i++) {
            lista.add(i);
        }

        return lista;
    }

    public static List<Integer> range(int also, int felso, int lepeskoz) {
        List<Integer> lista = new ArrayList();

        for (int i = also; i < felso; i+= lepeskoz) {
            lista.add(i);
        }

        return lista;
    }
}
