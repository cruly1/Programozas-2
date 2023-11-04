public class TestProduct {
    private static void productTest() {
        assert Main.product() == 1;
        assert Main.product(2) == 2;
        assert Main.product(1, 2, 3) == 6;
        assert Main.product(2, 5, 10, 3) == 300;
    }

    public static void main(String[] args) {
        productTest();
    }
}
