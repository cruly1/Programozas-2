public class Main {
    private static int stringDigitSum(String s) {
        int counter = 0;

        for (char letter : s.toCharArray()) {
            counter += Integer.parseInt(String.valueOf(letter));
        }

        return counter;
    }

    public static void main(String[] args) {
        int result = stringDigitSum("90146852");
        System.out.println(result);
    }
}
