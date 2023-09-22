public class Main {
    public static void main(String[] args) {
        Negyzet negyzet = new Negyzet(3);
        int k = negyzet.kerulet();
        int t = negyzet.terulet();

        System.out.println(k);
        System.out.println(t);
    }
}
