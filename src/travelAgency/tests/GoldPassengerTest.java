package travelAgency.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import travelAgency.*;

public class GoldPassengerTest {
    @Test
    public void signUpForActivity_ShouldDeductDiscountedCostFromBalance_WhenSufficientBalance() {
        // Arrange
        Destination destination = new Destination("Safari Park");
        Activity activity = new Activity("Safari", "Explore the wild", 100.0, 10, destination);
        GoldPassenger passenger = new GoldPassenger("John Doe", 1, 200.0);

        // Act
        boolean result = passenger.signUpForActivity(activity);

        // Assert
        assertTrue(result);
        assertEquals(110.0, passenger.getBalance(), 0.01); // 10% discount applied
    }
}