import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PickupTest {
    public Pickup pickup = Main.pickupForTests();

    @Test(groups = "testsForPickup")
    public void valuesBrandAndModelShouldBeDifferent() {
        assertNotEquals(pickup.brand, pickup.model);
    }

    @Test(groups = "testsForPickup")
    public void thisPickupShouldHaveThisTrunkVolume() {
        assertEquals(pickup.trunkVolume, 430);
    }
}
