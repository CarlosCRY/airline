package org.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private LocalDate flightDate;
    private TreeSet<Passenger> passengers = new TreeSet<>(new ComparatorPassSeat());
}
