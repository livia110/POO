package javaapplication7;

import java.util.ArrayList;

public class GeometricBodyController {
    static public GeometricBody getBiggestSurfaceBody(ArrayList<GeometricBody> bodies) {
        float max = 0;
        GeometricBody maxBody = null;

        for (GeometricBody i : bodies) {
            float surf = i.getSuprafata();

            if (surf > max) {
                max = surf;
                maxBody = i;
            }
        }

        return maxBody;
    }

    static public GeometricBody getBiggestVolumeBody(ArrayList<GeometricBody> bodies) {
        float max = 0;
        GeometricBody maxBody = null;

        for (GeometricBody i : bodies) {
            float surf = i.getVolum();

            if (surf > max) {
                max = surf;
                maxBody = i;
            }
        }

        return maxBody;
    }
}