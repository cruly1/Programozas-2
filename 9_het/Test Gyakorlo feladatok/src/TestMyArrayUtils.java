public class TestMyArrayUtils {
    private static void equalsTest() {
        assert MyArrayUtils.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3}) == true;
        assert MyArrayUtils.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4}) == false;
        assert MyArrayUtils.equals(new int[]{1, 2, 3}, new int[]{3, 4, 5}) == false;
        assert MyArrayUtils.equals(new int[]{}, new int[]{}) == true;
    }

    private static void isSortedTest() {
        assert MyArrayUtils.isSorted(new int[]{1, 2, 3}) == true;
        assert MyArrayUtils.isSorted(new int[]{-1, -2, -3}) == false;
        assert MyArrayUtils.isSorted(new int[]{4, 7, 8, 9, 20}) == true;
        assert MyArrayUtils.isSorted(new int[]{1, 2, 3, 4, 0}) == false;
    }

    private static void getMinElemTest() {
        assert MyArrayUtils.getMinElem(new int[]{7, 5, 8, 3, 1}) == 1;
        assert MyArrayUtils.getMinElem(new int[]{-1, -6, -20, 1}) == -20;
    }

    private static void getMaxElemTest() {
        assert MyArrayUtils.getMaxElem(new int[]{7, 5, 8, 3, 1}) == 8;
        assert MyArrayUtils.getMaxElem(new int[]{-1, -6, -20, 1}) == 1;
    }

    public static void main(String[] args) {
        equalsTest();
        isSortedTest();
        getMinElemTest();
        getMaxElemTest();
    }
}
