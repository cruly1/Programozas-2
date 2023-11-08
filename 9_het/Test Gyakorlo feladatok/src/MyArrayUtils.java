public class MyArrayUtils {
    private MyArrayUtils() {}

    public static boolean equals(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            return false;
        }

        for (int i = 0; i < tomb1.length; i++) {
            if (!(tomb1[i]==tomb2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void fill(int[] tomb, int value) {
        for (int elem : tomb) {
            elem = value;
        }
    }

    public static boolean isSorted(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static int getMinElem(int[] tomb) {
        int res = tomb[0];

        for (int elem : tomb) {
            if (elem < res) {
                res = elem;
            }
        }

        return res;
    }

    public static int getMaxElem(int[] tomb) {
        int res = tomb[0];

        for (int elem : tomb) {
            if (elem > res) {
                res = elem;
            }
        }

        return res;
    }
}