public class Main {
    public static void main(String[] args) {
        Gomb gomb = new Gomb(2.5);
        double f = gomb.felszin();
        double t = gomb.terfogat();

        System.out.printf("%.2f\n", f);
        System.out.printf("%.2f\n", t);
    }
}
