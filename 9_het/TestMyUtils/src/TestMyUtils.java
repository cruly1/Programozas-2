public class TestMyUtils {
    private static void absTest() {
        assert Math.abs(3) == 3;
        assert Math.abs(0) == 0;
        assert Math.abs(-3) == 3;
    }

    private static void duplazTest() {
        assert MyUtils.duplaz(0) == 0;
        assert MyUtils.duplaz(-3) == -6;
        assert MyUtils.duplaz(5) == 10;
    }

    private static void strlenTest() {
        assert MyUtils.strlen("") == 0;
        assert MyUtils.strlen("hello") == 5;
        assert MyUtils.strlen("hellohe") == 7;
    }

    public static void main(String[] args) {
        absTest();
        duplazTest();
        strlenTest();
    }
}
