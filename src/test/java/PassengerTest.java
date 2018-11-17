import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Flight flight;
    Plane plane;
    FlightNumber flightNumber;
    DepartureAirport departureAirport;
    Destination destination;

    @Before
    public void setUp() throws Exception {
        passenger1 = new Passenger("Locke", 20, 3);
        passenger2 = new Passenger("Charlie", 10, 1);
        passenger3 = new Passenger("Hurley", 40, 1);

        flight = new Flight(plane, flightNumber, departureAirport, destination, "1200");
    }

    @Test
    public void canCheckFlights() {
        assertEquals(0, passenger1.getNumberOfFlights());
    }

    @Test
    public void canAddFlightNumber() {
        passenger1.addFlight(flight);
        assertEquals(1, passenger1.getNumberOfFlights());
    }

    @Test
    public void canStartSeatNumberToOne() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(1, flight.getSeatNumber(passenger1));
        assertEquals(2, flight.getSeatNumber(passenger2));
    }

    @Test
    public void canRandomiseSeatNumbers() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.randomiseSeatNumbers();
        assertEquals(3, flight.getPassengersNumber());
        System.out.println(passenger1.getName());
        System.out.println(flight.getSeatNumber(passenger1));
        System.out.println(flight.getSeatNumber(passenger2));
        System.out.println(flight.getSeatNumber(passenger3));
    }

    //    @Test
//    public void canGetSeatNumber() {
//        passenger1.addFlight(flight);
//        passenger2.addFlight(flight);
//        passenger3.addFlight(flight);
//        flight.bookPassenger(passenger1);
//        flight.bookPassenger(passenger2);
//        flight.bookPassenger(passenger3);
//        assertEquals(1, passenger1.getNumberOfFlights());
//        assertEquals(3, flight.getPassengersNumber());
//        assertEquals(0, passenger1.getSeatNumber(passenger1));
    }
//}
