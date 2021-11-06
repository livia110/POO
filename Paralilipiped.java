package javaapplication7;

public class Paralilipiped implements GeometricBody {

    private float a, b, c;

    public Paralilipiped(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getVolum() {
        return a * b * c;
    }

    public float getSuprafata() {
        return (2 * a * b) + (2 * b * c) + (2 * a * c);
    }
}