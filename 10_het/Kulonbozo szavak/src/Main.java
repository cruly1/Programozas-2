import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("input.txt");
        Set<String> set = new HashSet();

        for (String sor : sorok) {
            String[] szavak = sor.split(" ");
            for (String szo : szavak) {
                set.add(szo);
            }
        }

        System.out.println(set.size());
    }
}
