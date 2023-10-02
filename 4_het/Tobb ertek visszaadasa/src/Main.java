import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    private static int[] getMinMax(List<Integer> lista) {
        int[] res = new int[2];
        int legkisebb = lista.get(0);
        int legnagyobb = lista.get(0);

        for (int elem : lista) {
            if (elem < legkisebb) {
                legkisebb = elem;
            }

            if (elem > legnagyobb) {
                legnagyobb = elem;
            }
        }

        res[0] = legkisebb;
        res[1] = legnagyobb;

        return res;
    }

    private static List<Integer> getMinMax2(List<Integer> lista) {
        List<Integer> res = new ArrayList();
        int legkisebb = lista.get(0);
        int legnagyobb = lista.get(0);

        for (int elem : lista) {
            if (elem < legkisebb) {
                legkisebb = elem;
            }

            if (elem > legkisebb) {
                legnagyobb = elem;
            }
        }

        res.add(legkisebb);
        res.add(legnagyobb);

        return res;
    }

    private static TobbErtek getMinMax3(List<Integer> lista) {
        TobbErtek res = new TobbErtek();
        res.legkisebb = lista.get(0);
        res.legnagyobb = lista.get(0);

        for (int elem : lista) {
            if (res.legkisebb > elem) {
                res.legkisebb = elem;
            }

            if (res.legnagyobb < elem) {
                res.legnagyobb = elem;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));

        int[] tomb = getMinMax(szamok);
        List<Integer> lista = getMinMax2(szamok);
        TobbErtek res = getMinMax3(szamok);

        System.out.println(Arrays.toString(tomb));
        System.out.println(lista);
        System.out.println("Legkisebb: " + res.legkisebb);
        System.out.println("Legnagyobb: " + res.legnagyobb);
    }
}
