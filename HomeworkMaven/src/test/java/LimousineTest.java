import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LimousineTest {
    public Limousine limousine = Main.limousineForTests();

    @Test(groups = "testsForLimousine")
    public void engineCapacityDataTypeShouldBeDouble() {
        boolean valueEngineCapacityIsDouble = limousine.engineCapacity instanceof Double;
        assertTrue(valueEngineCapacityIsDouble, "Engine capacity data type should be double");
    }

    @Test(groups = "testsForLimousine")
    public void numberOfSeatShouldBeMoreThanFour() {
        boolean valueNumberOfSeatLessThanFour = limousine.numberOfSeat < 4;
        assertFalse(valueNumberOfSeatLessThanFour, "Number of seat should be more than four");
    }
}
