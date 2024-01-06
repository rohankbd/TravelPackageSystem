package travelAgency;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public List<Activity> getActivities() {
        return this.activities;
    }

    public String getName() {
        return this.name;
    }
}