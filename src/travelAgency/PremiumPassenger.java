package travelAgency;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, 0);
    }

    @Override
    public boolean signUpForActivity(Activity activity) {
        return activity.signUpPassenger(this);
    }
}