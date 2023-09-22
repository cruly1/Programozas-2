import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tomb1 = {3, 1, 41, 64, 2, 5, 4, 12};
        int[] tomb2 = {1, 2, 3, 4, 5};
        int[] tomb3 = new int[10];

        // Tömb kiíratása
        System.out.println(Arrays.toString(tomb1));

        // Tömb megfordítása és kiíratása
        MyArrayUtils.reverse(tomb1);
        System.out.println(Arrays.toString(tomb1));

        // Tömb elemei csökkenő sorrendbe rendezése és kiíratása
        MyArrayUtils.sortDescending(tomb1);
        System.out.println(Arrays.toString(tomb1));

        // Két tömb összehasonlítása és eredmény kiíratása
        boolean result1 = MyArrayUtils.equals(tomb1, tomb2);
        System.out.println(result1);

        // Tömb feltöltése egy adott értékkel és kiíratása
        MyArrayUtils.fill(tomb3, 3);
        System.out.println(Arrays.toString(tomb3));

        // Tömb rendezés és kiíratása
        MyArrayUtils.sort(tomb1);
        System.out.println(Arrays.toString(tomb1));
    }
}
