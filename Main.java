package javaapplication7;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        GeometricBody cub = new Cub(5);
        GeometricBody sfera = new Sfera(5);
        GeometricBody paralilipiped = new Paralilipiped(5, 15, 25);

        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();

        System.out.println("Basic Level:");

        System.out.println("\nCub:");
        System.out.println("Volum: " + cub.getVolum());
        System.out.println("Suprafata: " + cub.getSuprafata());

        System.out.println("\nSfera:");
        System.out.println("Volum: " + sfera.getVolum());
        System.out.println("Suprafata: " + sfera.getSuprafata());

        System.out.println("\nParalilipiped:");
        System.out.println("Volum: " + paralilipiped.getVolum());
        System.out.println("Suprafata: " + paralilipiped.getSuprafata());


        bodies.add(cub);
        bodies.add(sfera);
        bodies.add(paralilipiped);

        System.out.println("\nAdvanced Level:\n");
        System.out.println("Cea mai mare suprafata este: " + GeometricBodyController.getBiggestSurfaceBody(bodies).getSuprafata());
        System.out.println("Cel mai mare volum este: " + GeometricBodyController.getBiggestVolumeBody(bodies).getVolum());

    }

    private static class GeometricBodyController {

        public GeometricBodyController() {
        }
    }
}