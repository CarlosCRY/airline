package org.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Passenger implements Comparable<Passenger> {
    private String nif;
    private int seatNumber;
    private Set<Luggage> luggages;

    @Override
    public int compareTo(Passenger o) {
        return Integer.compare(this.seatNumber, o.getSeatNumber());
    }
}
