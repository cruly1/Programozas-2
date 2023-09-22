public class Hamming {
    private String word;

    public Hamming(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    public int getDistance(Hamming other) {
        int counter = 0;

        if (word.length() != other.word.length()) {
            return -1;
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != other.word.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }
}
