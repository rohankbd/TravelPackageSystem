package travelAgency;

import java.util.ArrayList;
import java.util.List;

public abstract class Passenger {
    protected String name;
    protected int passengerNumber;
    protected double balance;
    protected List<Activity> signedUpActivities;

    public Passenger(String name, int passengerNumber, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.signedUpActivities = new ArrayList<>();
    }

    public abstract boolean signUpForActivity(Activity activity);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return this.passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addActivity(Activity activity) {
        this.signedUpActivities.add(activity);
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Passenger Number: " + this.passengerNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Activities:");
        for (Activity activity : this.signedUpActivities) {
            System.out.println("  Activity: " + activity.getName() + ", Destination: "
                    + activity.getDestination().getName() + ", Price: " + activity.getCost());
        }
    }
}