package org.practica.models;

import java.util.Comparator;

public class ComparatorPassNif implements Comparator<Passenger> {

    @Override
    public int compare(Passenger x, Passenger y) {
        return x.getNif().compareTo(y.getNif());
    }
}
