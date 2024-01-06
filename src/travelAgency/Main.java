package travelAgency;

public class Main {
    public static void main(String[] args) {
        // Create a destination and add the activities to it
        Destination destination = new Destination("Destination 1");
        
        // Create some activities
        Activity safari = new Activity("Safari", "Explore the wild", 100.0, 10, destination);
        Activity cityTour = new Activity("City Tour", "Visit the city's main attractions", 50.0, 20, destination);

        destination.addActivity(safari);
        destination.addActivity(cityTour);

        // Create some passengers
        StandardPassenger john = new StandardPassenger("John Doe", 1, 200.0);
        GoldPassenger jane = new GoldPassenger("Jane Doe", 2, 300.0);
        PremiumPassenger bob = new PremiumPassenger("Bob Smith", 3);

        // Create a travel package and add the destination and passengers to it
        TravelPackage travelPackage = new TravelPackage("Package 1", 10);
        travelPackage.addDestination(destination);
        travelPackage.addPassenger(john);
        travelPackage.addPassenger(jane);
        travelPackage.addPassenger(bob);

        // Print the itinerary and passenger list
        travelPackage.printItinerary();
        travelPackage.printPassengerList();

        // Print the details of an individual passenger
        john.printDetails();

        // Print the details of all the activities that still have spaces available
        travelPackage.printAvailableActivities();
    }
}