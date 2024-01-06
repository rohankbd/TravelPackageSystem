package travelAgency.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import travelAgency.*;

public class ActivityTest {
    @Test
    public void signUpPassenger_ShouldIncreaseSignedUpPassengers_WhenCapacityAvailable() {
        // Arrange
        Destination destination = new Destination("Safari Park");
        Activity activity = new Activity("Safari", "Explore the wild", 100.0, 10, destination);
        Passenger passenger = new StandardPassenger("John Doe", 1, 200.0);

        // Act
        boolean result = activity.signUpPassenger(passenger);

        // Assert
        assertTrue(result);
        assertEquals(1, activity.getSignedUpPassengers().size());
    }
}