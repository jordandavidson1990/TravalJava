import java.util.ArrayList;
import java.util.Collections;

public class Passenger {

    private String name;
    private int numberOfBags;
    private int bagWeight;
    private ArrayList<Flight> bookedFlights;
    private int seatNumber;

    public Passenger(String name, int bagWeight, int numberOfBags) {
        this.name = name;
        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
        this.bookedFlights = new ArrayList<Flight>();
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public int getBagWeight() {
        return bagWeight;
    }

    public int getNumberOfFlights() {
        return bookedFlights.size();
    }

    public void addFlight(Flight flight) {
        this.bookedFlights.add(flight);
    }

    public int getSeatNumber(Passenger passenger) {
        return bookedFlights.indexOf(passenger);
    }


//    public int getSeatNumber(Passenger passenger) {
//        Collections.shuffle(this.bookedFlights);
//        int randomSeatNumber = this.bookedFlights.indexOf(0);
//        return randomSeatNumber;
//    }
}
