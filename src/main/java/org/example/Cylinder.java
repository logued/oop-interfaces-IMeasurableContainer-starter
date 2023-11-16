package org.example;

/** Cylinder shaped container, e.g. barrel of oil, can of beans
 *
 */

public class Cylinder implements IMeasurableContainer{

    private double diameter;    // in meters
    private double height;      // in meters
    private double weight;

    public Cylinder(double diameter, double height, double weight) {
        this.diameter = diameter;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    // boxVolume is the volume of the smallest box that can hold this cylinder.
    @Override
    public double rectangularVolume() {
        return diameter * diameter * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "diameter=" + diameter +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
