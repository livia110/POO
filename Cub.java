package javaapplication7;

public class Cub implements GeometricBody {
    private float length;

    public Cub(float l) {
        length = l;
    }

    public float getSuprafata() {
        return 6 * (length * length);
    }

    public float getVolum() {
        return length * length * length;
    }

}