package org.example;

/**
 * A box (like cardboard or wooden box) used as a container.
 *
 */
public class Box implements IMeasurableContainer{
    private double width;
    private double height;
    private double depth;
    private double weight;

    public Box(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public double weight() { return weight;  }

    @Override
    public double rectangularVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", weight=" + weight +
                '}';
    }
}
