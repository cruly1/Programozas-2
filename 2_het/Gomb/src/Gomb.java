public class Gomb {
    private double radius;

    public Gomb(double radius) {
        this.radius = radius;
    }

    public double felszin() {
        return 4 * Math.pow(this.radius, 2) * Math.PI;
    }

    public double terfogat() {
        return 4 * Math.pow(this.radius, 3) * Math.PI / 3;
    }
}
