package travelAgency;

public class StandardPassenger extends Passenger {
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

    @Override
    public boolean signUpForActivity(Activity activity) {
        if (this.balance >= activity.getCost() && activity.signUpPassenger(this)) {
            this.balance -= activity.getCost();
            this.addActivity(activity);
            return true;
        } else {
            return false;
        }
    }
}