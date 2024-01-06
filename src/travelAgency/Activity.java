package travelAgency;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private List<Passenger> signedUpPassengers;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.signedUpPassengers = new ArrayList<>();
        this.destination = destination;
    }

    public boolean signUpPassenger(Passenger passenger) {
        if (this.signedUpPassengers.size() < this.capacity) {
            this.signedUpPassengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSpaces() {
        return this.capacity - this.signedUpPassengers.size();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getSignedUpPassengers() {
        return this.signedUpPassengers;
    }

    public void setSignedUpPassengers(List<Passenger> signedUpPassengers) {
        this.signedUpPassengers = signedUpPassengers;
    }

    public Destination getDestination() {
        return this.destination;
    }
}