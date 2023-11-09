import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("input.txt");
        Map<String, Integer> map = new HashMap();

        for (String sor : sorok) {
            String[] szavak = sor.split(" ");
            for (String szo : szavak) {
                if (!map.containsKey(szo)) {
                    map.put(szo, 1);
                } else {
                    map.replace(szo, map.get(szo)+1);
                }
            }
        }

        String legnagyobbKulcs = "";
        int legnagyobbErtek = 0;
        for (String k : map.keySet()) {
            System.out.printf("%s: %d\n", k, map.get(k));
            if (legnagyobbErtek < map.get(k)) {
                legnagyobbErtek = map.get(k);
                legnagyobbKulcs = k;
            }
        }

        System.out.print("A legtobbszor elofordulo szo: ");
        System.out.printf("%s -> %d\n", legnagyobbKulcs, legnagyobbErtek);
    }
}
