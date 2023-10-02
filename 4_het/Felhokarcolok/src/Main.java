import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String s = "179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216";
        int counter = 0;
        List<Integer> lista = new ArrayList();

        for (char betu : s.toCharArray()) {
            lista.add(Integer.parseInt(Character.toString(betu)));
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            counter += Math.abs(lista.get(i) - lista.get(i + 1));
        }

        System.out.println(counter);
    }
}