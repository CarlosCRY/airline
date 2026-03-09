package org.practica;

import org.practica.models.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public Airline airline = Constants.AIRLINE;
    public static void main(String[] args) {
        Airline airline = Constants.AIRLINE;

        Integer numberInput;
        String textInput;

        System.out.println("Introduzca número de vuelo para ver los pasajeros");
        // 247, 188, 402

        numberInput = scanner.nextInt();
        scanner.nextLine();

        if (airline.passengersOnFlight(numberInput).isEmpty()) {
            System.out.println("Vuelo no encontrado");
        } else {
            airline.passengersOnFlight(numberInput).toString();
        }

        System.out.println("Introduzca número de vuelo para ver los clientes");
        // 247, 188, 402

        numberInput = scanner.nextInt();
        scanner.nextLine();

        if (airline.customersOnFlight(numberInput).isEmpty()) {
            System.out.println("Vuelo no encontrado");
        } else {
            airline.customersOnFlight(numberInput).toString();
        }

        System.out.println("Introduzca un apellido para ver los clientes que tienen este apellido");
        // Smith, Johnson, Williams, Brown
        airline.customersBySurname(scanner.nextLine()).toString();

        textInput = scanner.nextLine();

        if (airline.customersBySurname(textInput).isEmpty()) {
            System.out.println("Apellido no coincide con ningún cliente");
        } else {
            airline.customersBySurname(textInput).toString();
        }

        System.out.println("Introduzca número de vuelo y NIF del pasajero cuyo asiento quiere encontrar");
        // 247 (12345678Z, 23456789R, 45678901F)
        // 188 (12345678Z, 87654321K, 34567890A)
        // 402 (87654321K, 23456789R, 45678901F)
        airline.findSeat(scanner.nextInt(), scanner.nextLine()).toString();

        numberInput = scanner.nextInt();
        textInput = scanner.nextLine();

        if (airline.findSeat(numberInput, textInput).isEmpty()) {
            System.out.println("Apellido no coincide con ningún cliente");
        } else {
            airline.findSeat(numberInput, textInput).toString();
        }

        Luggage nLuggage = new Luggage ("0000", "Maleta dockeada");

        numberInput = scanner.nextInt();
        textInput = scanner.nextLine();

        airline.giveLuggage(scanner.nextInt(), scanner.nextLine(),nLuggage);

        String tNif = textInput;
        airline.getFlights().get(numberInput).getPassengers().stream()
                            .filter(passenger -> passenger.getNif().equals(tNif))
                            .forEach(passenger -> passenger.getLuggages().toString());
    }
}
