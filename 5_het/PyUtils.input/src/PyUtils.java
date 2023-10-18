import java.util.Scanner;

public class PyUtils {
    private PyUtils() {}

    public static String input(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(szoveg);
        String name = sc.nextLine();
        sc.close();
        return name;
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        return name;
    }
}
