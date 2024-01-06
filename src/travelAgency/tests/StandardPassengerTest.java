package travelAgency.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import travelAgency.*;

public class StandardPassengerTest {
    @Test
    public void signUpForActivity_ShouldDeductCostFromBalance_WhenSufficientBalance() {
        // Arrange
        Destination destination = new Destination("Safari Park");
        Activity activity = new Activity("Safari", "Explore the wild", 100.0, 10, destination);
        StandardPassenger passenger = new StandardPassenger("John Doe", 1, 200.0);

        // Act
        boolean result = passenger.signUpForActivity(activity);

        // Assert
        assertTrue(result);
        assertEquals(100.0, passenger.getBalance(), 0.01);
    }
}