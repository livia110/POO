package javaapplication7;

public class Sfera implements GeometricBody {
    private float r;

    public Sfera(float r) {
        this.r = r;
    }

    public float getSuprafata() {
        return (float)Math.PI * (r * r) * 4;
    }

    public float getVolum() {
        return (float)Math.PI * (r * r * r) * (4/3);
    }
}