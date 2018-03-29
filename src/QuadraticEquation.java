public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    double delta = 0;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double sqrDelta = Math.sqrt(delta);
        double x2 = (-b + sqrDelta) / (2 * a);
        return x2;
    }

    public double getRoot2() {
        double sqrDelta = Math.sqrt(delta);
        double x3 = (-b - sqrDelta) / (2 * a);
        return x3;
    }
}
