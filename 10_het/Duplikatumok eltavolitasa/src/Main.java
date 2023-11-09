import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = List.of(5, 2, 3, 5, 1, 4, -200, 5, 1, 3, 2, 2, 5);
        Set<Integer> set = new HashSet<>(lista);
        lista = new ArrayList(set);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
