import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Flight flight;
    FlightNumber flightNumber;
    DepartureAirport departureAirport;
    Destination destination;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    FlightManager flightManager;

    @Before
    public void setUp() throws Exception {

        plane = new Plane(PlaneType.BOEING747);
        flightNumber = flightNumber.OCEANIC815;
        departureAirport = departureAirport.GLASGOW;
        destination = destination.TOKYO;

        flight = new Flight(plane, flightNumber, departureAirport, destination, "1200");

        passenger1 = new Passenger("Jack", 20, 2);
        passenger2 = new Passenger("Kate", 10, 1);
        passenger3 = new Passenger("Charlie", 10, 3);

        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);

    }

    @Test
    public void canGetBaggagePerPassenger() {
        assertEquals(40, flight.getPassengerBagWeight(passenger1));
    }

    @Test
    public void canGetTotalBaggage() {
        assertEquals(50, flight.getTotalBaggageWeight());
    }

    @Test
    public void calculateTotalBaggageAllowedInFlight() {
        assertEquals(25000, flight.startingBaggageAllowance());
    }

    @Test
    public void canCalculateHowMuchBaggageWeightShouldBeReservedPerPerson() {
        assertEquals(60, flight.howMuchBaggageWeighShouldBeAllowed(), 0.1);
    }

    @Test
    public void canCalculateHowMuchBaggageIsLeftOnFlight() {
        assertEquals(24950, flight.remainingWeight());
    }
//
//    @Test
//    public void canBookPassengerToFlight() {
//        flightManager.processBookingToFlight(passenger3, flight);
//        assertEquals(3, flight.getPassengersNumber());
//        assertEquals(1, passenger3.getNumberOfFlights());
//    }
}
