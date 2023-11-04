public class TestVerem {
    private static void isEmptyTest() {
        Verem v1 = new Verem();
        assert v1.isEmpty() == true;
    }

    private static void sizeTest() {
        Verem v1 = new Verem();
        assert v1.size() == 0;
    }

    public static void main(String[] args) {
        sizeTest();
        isEmptyTest();
    }
}
