public class Main {
    private static String cleanWhiteSpaces(String s) {
        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '\n') {
                continue;
            }
            cleaned += s.charAt(i);
        }

        return cleaned;
    }

    public static void main(String[] args) {
        String ip1 = "192.20.246.138:\n 6666";
        String ip2 = "206.130.99.82:\n8080";

        String newIp1 = cleanWhiteSpaces(ip1);
        String newIp2 = cleanWhiteSpaces(ip2);

        System.out.println(newIp1);
        System.out.println(newIp2);
    }
}
