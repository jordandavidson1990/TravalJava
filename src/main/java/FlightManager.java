import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Passenger> passenger;
    private ArrayList<Flight> flight;

    public FlightManager() {
        this.passenger = new ArrayList<Passenger>();
        this.flight = new ArrayList<Flight>();
    }

    public void processBookingToFlight(Passenger passenger, Flight flight) {
        flight.bookPassenger(passenger);
        passenger.addFlight(flight);
        this.passenger.add(passenger);
        this.flight.add(flight);

    }
}
