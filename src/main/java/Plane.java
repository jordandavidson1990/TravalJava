public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public PlaneType getPlane() {
        return plane;
    }

    public int getCapacityFromPlaneType(){
        return this.plane.getCapacity();
    }

    public int getWeightFromPlaneType() {
        return this.plane.getWeight();
    }
}
