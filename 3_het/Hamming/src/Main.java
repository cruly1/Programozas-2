public class Main {
    public static void main(String[] args) {
        Hamming word1 = new Hamming("toned");
        Hamming word2 = new Hamming("roses");

        int hammingDistance = word1.getDistance(word2);

        if (hammingDistance == -1) {
            System.out.println("A Hamming távolság nem értelmezett erre a két szóra, mert a hosszuk nem egyezik meg");
        } else {
            System.out.printf("A(z) %s és %s szavak Hamming távolsága: %d\n", word1.getWord(), word2.getWord(), hammingDistance);
        }
    }
}
