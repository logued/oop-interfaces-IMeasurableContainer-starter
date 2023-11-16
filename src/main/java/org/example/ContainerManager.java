package org.example;

import java.util.ArrayList;
import java.util.List;

// This container manager class can store containers (Boxes, cylinders etc.)
// and can calculate some total values for those containers.
// However, it will only deal with containers that have implemented the
// IMeasurableContainer interface.

public class ContainerManager {

    List<IMeasurableContainer> containerList;

    public ContainerManager() {
        this.containerList = new ArrayList<>();
    }

    public void add( IMeasurableContainer container ) {
        containerList.add(container);
    }

    public double totalWeight() {
        double total=0.0;
        for (IMeasurableContainer container : containerList ) {
            total += container.weight();
        }
        return total;
    }

    public double totalRectangularVolume() {
        double total=0.0;
        for (IMeasurableContainer container : containerList ) {
            total += container.rectangularVolume();
        }
        return total;
    }
}
