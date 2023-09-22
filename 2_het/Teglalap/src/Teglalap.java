public class Teglalap {
    private int magassag;
    private int szelesseg;

    public Teglalap(int magassag, int szelesseg) {
        this.magassag = magassag;
        this.szelesseg = szelesseg;
    }

    public int getMagassag() {
        return this.magassag;
    }

    public int getSzelesseg() {
        return this.szelesseg;
    }

    public int kerulet() {
        return (this.magassag + this.szelesseg) * 2;
    }

    public int terulet() {
        return this.magassag * this.szelesseg;
    }
}
