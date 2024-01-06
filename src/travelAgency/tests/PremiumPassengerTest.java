package travelAgency.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import travelAgency.*;

public class PremiumPassengerTest {
    @Test
    public void signUpForActivity_ShouldNotDeductCostFromBalance() {
        // Arrange
        Destination destination = new Destination("Safari Park");
        Activity activity = new Activity("Safari", "Explore the wild", 100.0, 10, destination);
        PremiumPassenger passenger = new PremiumPassenger("John Doe", 1);

        // Act
        boolean result = passenger.signUpForActivity(activity);

        // Assert
        assertTrue(result);
        assertEquals(0.0, passenger.getBalance(), 0.01); // Premium passengers sign up for free
    }
}