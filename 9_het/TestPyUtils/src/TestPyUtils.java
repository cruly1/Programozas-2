import java.util.List;

public class TestPyUtils {
    private static void rangeTest() {
        assert PyUtils.range(5).equals(List.of(0, 1, 2, 3, 4));
        assert PyUtils.range(3, 8).equals(List.of(3, 4, 5, 6, 7));
        assert PyUtils.range(6, 17, 2).equals(List.of(6, 8, 10, 12, 14, 16));
    }

    public static void main(String[] args) {
        rangeTest();
    }
}
