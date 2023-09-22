public class Negyzet {
    private int oldal;

    public Negyzet(int oldal) {
        this.oldal = oldal;
    }

    public int kerulet() {
        return 4 * this.oldal;
    }

    public int terulet() {
        return this.oldal * this.oldal;
    }
}
