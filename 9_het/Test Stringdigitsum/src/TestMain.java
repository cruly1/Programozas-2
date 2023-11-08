public class TestMain {
    private static void stringDigitSumTest() {
        assert Main.stringDigitSum("123") == 6;
        assert Main.stringDigitSum("765") == 18;
    }

    public static void main(String[] args) {
        stringDigitSumTest();
    }
}
