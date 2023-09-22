public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double kerulet() {
        return 2 * radius * Math.PI;
    }

    public double terulet() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
