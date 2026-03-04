package org.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private Date flightDate;
    private TreeSet<Passenger> passengers;
}
