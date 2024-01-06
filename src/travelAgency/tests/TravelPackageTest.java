package travelAgency.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import travelAgency.*;

public class TravelPackageTest {
    @Test
    public void addPassenger_ShouldIncreasePassengerCount_WhenCapacityAvailable() {
        // Arrange
        TravelPackage travelPackage = new TravelPackage("Safari", 10);
        Passenger passenger = new StandardPassenger("John Doe", 1, 200.0);

        // Act
        travelPackage.addPassenger(passenger);

        // Assert
        assertEquals(1, travelPackage.getPassengers().size());
    }
}