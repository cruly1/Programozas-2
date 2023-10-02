import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Saját max metódus
        int a = 6;
        int b = 5;
        System.out.println(MyMath.max(a, b));

        // Saját equals metódus
        int[] tomb1 = {1, 2, 3};
        int[] tomb2 = {1, 2, 3};
        int[] tomb3 = {6, 3, 2};
        System.out.println(MyArrayUtils.equals(tomb1, tomb2));
        System.out.println(MyArrayUtils.equals(tomb1, tomb3));

        // Saját fill metódus
        MyArrayUtils.fill(tomb2, 0);
        System.out.println(Arrays.toString(tomb2));

        // Saját isSorted metódus
        System.out.println(MyArrayUtils.isSorted(tomb1));
        System.out.println(MyArrayUtils.isSorted(tomb3));

        // Saját getMinElem és getMaxElem metódus
        System.out.println(MyArrayUtils.getMinElem(tomb1));
        System.out.println(MyArrayUtils.getMaxElem(tomb1));
    }
}
