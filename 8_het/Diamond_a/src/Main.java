import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Magassag: ");
        int magassag = Integer.parseInt(sc.nextLine());
        sc.close();

        if (magassag % 2 == 0) {
            System.err.println("Hibas bemenet!");
            System.exit(1);
        }

        int felso_resz = (magassag + 1) / 2;

        for (int i = 1; i <= felso_resz; i++) {
            for (int j = felso_resz; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = felso_resz - 1; i >= 1; i--) {
            for (int j = felso_resz; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
