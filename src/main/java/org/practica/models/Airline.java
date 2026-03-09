package org.practica.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Airline {
    private String name;
    private Map<Integer, Flight> flights;
    private Set<Customer> customers;

    public List<Passenger> passengersOnFlight(int flightN) {
        return flights.get(flightN).getPassengers().stream()
                                                   .toList();
    }

    public List<Customer> customersOnFlight(int flightN) {
        List<String> customerNifs = passengersOnFlight(flightN).stream()
                                                               .map(passenger -> passenger.getNif())
                                                               .toList();
        return customers.stream()
                        .filter(customer -> customerNifs.contains(customer.getNif()))
                        .toList();
    }

    public List<Customer> customersBySurname(String tSurname) {
        return customers.stream()
                        .filter(customer -> customer.getSurname().equals(tSurname))
                        .toList();
    }

    public Optional<Integer> findSeat (int flightN, String tNif) {
        return passengersOnFlight(flightN).stream()
                                          .filter(passenger -> passenger.getNif().equals(tNif))
                                          .map(passenger -> passenger.getSeatNumber())
                                          .findFirst();
    }

    public void giveLuggage (int flightN, String tNif, Luggage nLuggage) {
        if (flights.get(flightN) == null) {
            System.out.println("El número de vuelo dado no existe.");
        } else {
            flights.get(flightN).getPassengers().stream()
                    .filter(passenger -> passenger.getNif().equals(tNif))
                    .findFirst()
                    .ifPresentOrElse(
                            passenger -> passenger.getLuggages().add(nLuggage),
                            () -> System.out.println("No se encontró el NIF dado."));
        }
    }

    public List<Flight> findFlights (String tNif) {
        List<Flight> listFlights = new ArrayList<>();

        flights.forEach((key, flight) -> flight.getPassengers().forEach(
                                passenger -> {if (passenger.getNif().equals(tNif)) listFlights.add(flight);})
        );

        return listFlights;
    }
}
