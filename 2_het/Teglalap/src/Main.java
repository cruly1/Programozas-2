public class Main {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(3, 5);
        int k = t1.kerulet();
        int t = t1.terulet();

        Teglalap t2 = new Teglalap(t1.getMagassag() * 2, t1.getSzelesseg() * 2);

        System.out.println(k + " cm");
        System.out.println(t + " cm2");
    }
}
