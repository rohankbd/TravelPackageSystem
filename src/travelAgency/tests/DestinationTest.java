package travelAgency.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import travelAgency.*;

public class DestinationTest {
    @Test
    public void addActivity_ShouldIncreaseActivityCount() {
        // Arrange
        Destination destination = new Destination("Safari Park");
        Activity activity = new Activity("Safari", "Explore the wild", 100.0, 10, destination);

        // Act
        destination.addActivity(activity);

        // Assert
        assertEquals(1, destination.getActivities().size());
    }
}