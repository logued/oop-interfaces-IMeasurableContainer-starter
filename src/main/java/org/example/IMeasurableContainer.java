package org.example;

/**
 * weight : the weight in kg of a container (including contents)
 * rectangularVolume : the dimensions of the smallest box this item will fit into
 */
public interface IMeasurableContainer {
    double weight();
    double rectangularVolume();

    //default double aNewMethod( ) { return 0.0; };
}
