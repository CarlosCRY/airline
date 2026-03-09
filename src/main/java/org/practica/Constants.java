package org.practica;

import org.practica.models.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Constants {
    public static List<Customer> CUSTOMERS = List.of(
            new Customer("12345678Z", "Emily", "Smith"),
            new Customer("87654321K", "James", "Smith"),
            new Customer("23456789R", "Michael", "Johnson"),
            new Customer("34567890A", "Sarah", "Williams"),
            new Customer("45678901F", "David", "Brown"));

    public static List<Luggage> LUGGAGES = List.of(
            new Luggage("0101", "Maleta de cabina"),
            new Luggage("0102", "Maleta de cabina"),
            new Luggage("0103", "Maleta de cabina"),
            new Luggage("0201", "Maleta grande"),
            new Luggage("0202", "Maleta grande"),
            new Luggage("0301", "Maleta rígida"),
            new Luggage("0302", "Maleta rígida"),
            new Luggage("0303", "Maleta rígida"),
            new Luggage("0401", "Maleta blanda"),
            new Luggage("0402", "Maleta blanda"),
            new Luggage("0501", "Maleta expandible"),
            new Luggage("0A01", "Mochila de viaje"),
            new Luggage("0A02", "Mochila de viaje"),
            new Luggage("0B01", "Bolso de mano"),
            new Luggage("0B02", "Bolso de mano"),
            new Luggage("0B03", "Bolso de mano"));

    public static List<Passenger> PASSENGERSA = List.of(
            new Passenger(CUSTOMERS.get(2).getNif(), 22, Set.of(LUGGAGES.get(2), LUGGAGES.get(13))),
            new Passenger(CUSTOMERS.get(0).getNif(), 14, Set.of(LUGGAGES.get(0), LUGGAGES.get(6))),
            new Passenger(CUSTOMERS.get(4).getNif(), 37, Set.of(LUGGAGES.get(8), LUGGAGES.get(11)))
    );

    public static List<Passenger> PASSENGERSB = List.of(
            new Passenger(CUSTOMERS.get(1).getNif(), 6, Set.of(LUGGAGES.get(4), LUGGAGES.get(15))),
            new Passenger(CUSTOMERS.get(3).getNif(), 48, Set.of(LUGGAGES.get(7))),
            new Passenger(CUSTOMERS.get(0).getNif(), 37, Set.of(LUGGAGES.get(3), LUGGAGES.get(10)))
    );

    public static List<Passenger> PASSENGERSC = List.of(
            new Passenger(CUSTOMERS.get(4).getNif(), 9, Set.of(LUGGAGES.get(5))),
            new Passenger(CUSTOMERS.get(2).getNif(), 67, Set.of(LUGGAGES.get(14))),
            new Passenger(CUSTOMERS.get(1).getNif(), 26, Set.of(LUGGAGES.get(1), LUGGAGES.get(9), LUGGAGES.get(12)))
    );

    public static Map<Integer, Flight> FLIGHTS = Map.of(
            247, new Flight(247, "Madrid", "Washington-Dulles",
                    LocalDate.of(2026, 1, 15), new TreeSet<>(PASSENGERSA)),
            188, new Flight(188, "Washington-Dulles", "Atlanta",
                    LocalDate.of(2026, 3, 10), new TreeSet<>(PASSENGERSB)),
            402, new Flight(402, "Washington-Dulles", "Lisboa",
                    LocalDate.of(2026, 2, 22), new TreeSet<>(PASSENGERSC))
    );

    public static Airline AIRLINE = new Airline (
            "Washington-Dulles",
            FLIGHTS,
            Set.of(CUSTOMERS.get(0),CUSTOMERS.get(1),CUSTOMERS.get(2),CUSTOMERS.get(3),CUSTOMERS.get(4))
            );
}



