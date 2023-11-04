import java.util.List;

public class Main {
    private static int listElemSum(List<Integer> digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static void main(String[] args) {
        String fname = "day01.txt";
        List<Integer> digits = FileUtils.readFirstLineAsDigits(fname);
        int result = listElemSum(digits);
        System.out.println(result);
    }
}
