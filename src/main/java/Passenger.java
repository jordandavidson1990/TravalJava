public class Passenger {

    private String name;
    private int numberOfBags;
    private int bagWeight;

    public Passenger(String name, int bagWeight, int numberOfBags) {
        this.name = name;
        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
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
}
