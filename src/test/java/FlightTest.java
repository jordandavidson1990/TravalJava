import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    FlightNumber flightNumber;
    DepartureAirport departureAirport;
    Destination destination;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() throws Exception {

        plane = new Plane(PlaneType.BOEING747);
        flightNumber = flightNumber.OCEANIC815;
        departureAirport = departureAirport.GLASGOW;
        destination = destination.TOKYO;

        flight = new Flight(plane, flightNumber, departureAirport, destination, "1200");

        passenger1 = new Passenger("Jack", 20, 2);
        passenger2 = new Passenger("Kate", 10, 1);

    }

    @Test
    public void canCheckHowManyPassengers() {
        assertEquals(0, flight.getPassengersNumber());
    }

    @Test
    public void canAddPassenger() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPassengersNumber());
    }

    @Test
    public void canGetHowManyAvailableSeats() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(414, flight.getAvailableSeatsRemaining());
    }
}
