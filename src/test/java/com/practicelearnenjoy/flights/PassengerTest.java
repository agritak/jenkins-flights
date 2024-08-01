package com.practicelearnenjoy.flights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void testPassengerCreation() {
        Passenger passenger = new Passenger("123-456-789", "John Smith", "US");
        assertNotNull(passenger);
    }

    @Test
    void testInvalidCountryCode() {
        assertThrows(RuntimeException.class, () -> new Passenger("123-456-789", "John Smith", "USA"));
    }

    @Test
    void testPassengerToString() {
        Passenger passenger = new Passenger("123-456-789", "John Smith", "US");
        assertEquals("Passenger John Smith with identifier: 123-456-789 from US", passenger.toString());
    }

}
