public class TestMyMath {
    private static void maxTest() {
        assert MyMath.max(1, 2) == 2;
        assert MyMath.max(-1, -2) == -1;
        assert MyMath.max(0, 3) == 3;
    }

    public static void main(String[] args) {
        maxTest();
    }
}
