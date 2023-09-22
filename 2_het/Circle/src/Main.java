public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        double k = circle.kerulet();
        double t = circle.terulet();

        System.out.printf("%.2f\n", k);
        System.out.printf("%.2f\n", t);
    }
}
