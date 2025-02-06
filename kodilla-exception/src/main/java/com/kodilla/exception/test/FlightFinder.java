package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {
    public void findFlights(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("London", true);
        flights.put("Paris", false);
        flights.put("New York", false);
        flights.put("San Francisco", true);

        if (!flights.containsKey(flight.getArrivalAirport()) ||
                !flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("No flight found from " +
                    flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        }

        if (!flights.get(flight.getDepartureAirport()) ||
                !flights.get(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("No Flights available for " + flight.getArrivalAirport());
        }

        System.out.println("Flights found: " +
                flight.getDepartureAirport()
                + " To " + flight.getArrivalAirport() + " Is available");
    }
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "San Francisco");

        try {
            flightFinder.findFlights(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        Flight invalidFlight = new Flight("Warsaw", "Paris");

        try {
            flightFinder.findFlights(invalidFlight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        Flight AllinvalidFlight = new Flight("Paris", "New York");

        try {
            flightFinder.findFlights(AllinvalidFlight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        Flight outOfBoundsFlight = new Flight("Torun", "Krakow");

        try {
            flightFinder.findFlights(outOfBoundsFlight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
