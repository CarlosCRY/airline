package org.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Passenger {
    private String nif;
    private int seatNumber;
    private Set<Luggage> luggages;
}
