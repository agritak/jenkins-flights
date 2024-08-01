package com.practicelearnenjoy.flights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightWithPassengersTest {

    private Flight flight = new Flight("AA123", 1);

    @Test
    void testAddRemovePassenger() {
        Passenger passenger = new Passenger("123-456-789", "John Smith", "US");

        assertTrue(flight.addPassenger(passenger));
        assertEquals(1, flight.getNumberOfPassengers());
        assertEquals(flight, passenger.getFlight());

        assertTrue(flight.removePassenger(passenger));
        assertEquals(0, flight.getNumberOfPassengers());
        assertNull(passenger.getFlight());
    }

    @Test
    void testNumberOfSeats() {
        Passenger passenger = new Passenger("123-456-789", "John Smith", "US");
        flight.addPassenger(passenger);

        assertEquals(1, flight.getNumberOfPassengers());

        Passenger passenger2 = new Passenger("127-23-7890", "Michael Smith", "GB");

        assertThrows(RuntimeException.class, () -> flight.addPassenger(passenger2));
    }

    @Test
    void testPassengerJoinsFlight() {
        Passenger passenger = new Passenger("123-456-789", "John Smith", "US");
        passenger.joinFlight(flight);

        assertEquals(flight, passenger.getFlight());
        assertEquals(1, flight.getNumberOfPassengers());
    }

}
