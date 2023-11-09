import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> szavak = new ArrayList<>();
        List<String> betuk = List.of("a", "b", "c");
        List<Integer> szamok = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sorokSzama = 25;
        int oszlopokSzama = 27;
        String szo;

        for (int i = 0; i < sorokSzama; i++) {
            for (int j = 0; j < oszlopokSzama; j++) {
                szo = betuk.get(RandUtils.randrange(0, betuk.size())) + szamok.get(RandUtils.randrange(0, szamok.size()));
                szavak.add(szo);
            }
        }

        for (int i = 0; i < sorokSzama; i++) {
            for (int j = 0; j < oszlopokSzama; j++) {
                System.out.printf(szavak.get(i * oszlopokSzama + j) + " ");
            }
            System.out.println();
        }
    }
}
