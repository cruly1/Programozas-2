public class Main {
    public static void main(String[] args) {
        // sin
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println("Szinusz függvény, radiánban vár értéket!");
        System.out.println("------------------------------------------");

        // ceil
        System.out.println(Math.ceil(3.000001));
        System.out.println("Ceil metódus, felfele kerekít ha nem egész a szám.");
        System.out.println("------------------------------------------");

        // incrementExact
        System.out.println(Math.incrementExact(3));
        System.out.println("Pontosan eggyel növeli a neki megadott paramétert, de nem módosítja azt.");
        System.out.println("------------------------------------------");

        // pow
        System.out.println(Math.pow(2, 3));
        System.out.println("Hatványozás függvény.");
        System.out.println("------------------------------------------");

        // hypot
        System.out.println(Math.hypot(3, 4));
        System.out.println("Ha valaha derékszögű háromszög átfogót kell számolni Java-ban.");
    }
}
