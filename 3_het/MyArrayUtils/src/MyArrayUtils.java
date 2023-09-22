import java.util.Arrays;

public class MyArrayUtils {
    private MyArrayUtils() {

    }

    public static void reverse(int[] tomb) {
        int i = 0;
        int j = tomb.length - 1;
        int tmp;

        while (i < j) {
            tmp = tomb[i];
            tomb[i] = tomb[j];
            tomb[j] = tmp;
            i++;
            j--;
        }
    }

    public static void sortDescending(int[] tomb) {
        Arrays.sort(tomb);
        reverse(tomb);
    }

    public static boolean equals(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            return false;
        }

        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void fill(int[] tomb, int n) {
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = n;
        }
    }

    public static void sort(int[] tomb) {
        int tmp;

        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = 0; j < tomb.length - i - 1; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    tmp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = tmp;
                }
            }
        }
    }
}
