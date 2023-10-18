import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szoveg: ");
        String s = sc.nextLine();
        sc.close();

        StringBuilder res = new StringBuilder();

        for (char betu : s.toCharArray()) {
            if (Character.isLowerCase(betu)) {
                res.append(Character.toUpperCase(betu));
            } else if (Character.isUpperCase(betu)) {
                res.append(Character.toLowerCase(betu));
            } else {
                res.append(betu);
            }
        }

        System.out.println("Eredmeny: " + res);
    }
}
