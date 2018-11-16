import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() throws Exception {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneTypeCapactity() {
        assertEquals(416, plane.getCapacityFromPlaneType());
    }

    @Test
    public void canGetPlaneTypeWeight() {
        assertEquals(50000, plane.getWeightFromPlaneType());
    }
}
