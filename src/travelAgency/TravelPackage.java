package travelAgency;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        this.itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.passengerCapacity) {
            this.passengers.add(passenger);
        } else {
            System.out.println("Cannot add passenger. Travel package is at full capacity.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package Name: " + this.name);
        for (Destination destination : this.itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() + ", Cost: " + activity.getCost() + ", Capacity: "
                        + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package Name: " + this.name);
        System.out.println("Passenger Capacity: " + this.passengerCapacity);
        System.out.println("Number of Passengers: " + this.passengers.size());
        for (Passenger passenger : this.passengers) {
            System.out.println("Passenger Name: " + passenger.getName() + ", Passenger Number: "
                    + passenger.getPassengerNumber() );
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return this.itinerary;
    }

    public void setItinerary(List<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public List<Passenger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : this.itinerary) {
            for (Activity activity : destination.getActivities()) {
                int availableSpaces = activity.getAvailableSpaces();
                if (availableSpaces > 0) {
                    System.out.println("  Activity: " + activity.getName() + ", Destination: " + destination.getName() + ", Available Spaces: " + availableSpaces);
                }
            }
        }
    }
}