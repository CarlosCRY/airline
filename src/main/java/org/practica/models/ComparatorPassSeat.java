package org.practica.models;

import java.util.Comparator;

public class ComparatorPassSeat implements Comparator<Passenger> {

    @Override
    public int compare(Passenger x, Passenger y) {
        return Integer.compare(x.getSeatNumber(), y.getSeatNumber());
    }
}
