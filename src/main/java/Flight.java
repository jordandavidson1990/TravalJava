import java.util.ArrayList;
import java.util.Collections;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private FlightNumber flightNumber;
    private DepartureAirport departureAirport;
    private Destination destination;
    private String departureTime;

    public Flight(Plane plane, FlightNumber flightNumber, DepartureAirport departureAirport, Destination destination, String departureTime) {
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public FlightNumber getFlightNumber() {
        return flightNumber;
    }

    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    public Destination getDestination() {
        return destination;
    }

    public String getDespartureTime() {
        return departureTime;
    }

    public int getPassengersNumber() {
        return this.bookedPassengers.size();
    }


    public int getAvailableSeatsRemaining() {
        return (plane.getCapacityFromPlaneType() - this.bookedPassengers.size());
    }

    public void bookPassenger(Passenger passenger) {
//        if(getAvailableSeatsRemaining() >= 1)
            this.bookedPassengers.add(passenger);
    }

    public int getPassengerBagWeight(Passenger passenger) {
           return  passenger.getBagWeight()*passenger.getNumberOfBags();
    }

    public int getTotalBaggageWeight() {
        int totalWeight = 0;
        for (Passenger passenger:this.bookedPassengers){
            totalWeight += this.getPassengerBagWeight(passenger);
        }
        return totalWeight;
    }

    public double howMuchBaggageWeighShouldBeAllowed() {
        return this.startingBaggageAllowance()/plane.getCapacityFromPlaneType();
    }

    public int startingBaggageAllowance() {
        return plane.getWeightFromPlaneType()/2;
    }

    public int remainingWeight() {
        return this.startingBaggageAllowance()-this.getTotalBaggageWeight();
    }

    public int getSeatNumber(Passenger passenger) {
        int seatIndex = this.getBookedPassengers().indexOf(passenger);
        return seatIndex + 1;
    }

    public void randomiseSeatNumbers() {
        Collections.shuffle(this.getBookedPassengers());
    }
}
