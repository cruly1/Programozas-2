public class StringUtils {
    private StringUtils() {}

    public static String randomCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (char letter : s.toCharArray()) {
            if (Math.random() < 0.5) {
                sb.append(Character.toLowerCase(letter));
            } else {
                sb.append(Character.toUpperCase(letter));
            }
        }

        return sb.toString();
    }
}
