package travelAgency;

public class GoldPassenger extends Passenger {
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

    @Override
    public boolean signUpForActivity(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
        if (this.balance >= discountedCost && activity.signUpPassenger(this)) {
            this.balance -= discountedCost;
            this.addActivity(activity);
            return true;
        } else {
            return false;
        }
    }
}