public enum PlaneType {

    BOEING747(416, 50000),
    BOEING767(351, 17000),
    BOEING777(396, 35000),
    AIRBUSA300(266, 14000),
    AIRBUSA330(335, 24000);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
