public enum FlightNumber {

    OCEANIC815(815),
    AJIRA316(316),
    BA360(360),
    BA505(505),
    AA237(237),
    DL343(343);

    private final int flightNumber;

    FlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }


    public int getFlightNumber() {
        return flightNumber;
    }
}
