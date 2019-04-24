package AirportChallenge;

import java.util.ArrayList;

public class Airport {

    private static ArrayList<Plane> planes = new ArrayList<Plane>();
    public boolean weather = Weather.isStormy();

    public static ArrayList<Plane> getPlanes() {
        return planes;
    }

    public Object clearForTakeOff(Plane plane) {
        if(weather){
            return "Can't take off in a storm";
        }
        return planes.remove(plane);
    }

    public Object clearForLanding(Plane plane) {
        if(weather){
            return "Can't land in a storm";
        }
        return planes.add(plane);
    }

}