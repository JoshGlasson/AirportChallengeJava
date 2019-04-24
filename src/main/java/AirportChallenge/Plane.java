package AirportChallenge;

public class Plane {

    private Airport location;

    public void land(Airport airport) {
        airport.clearForLanding(this);
        location = airport;
    }

    public void takeOff() {
        location.clearForTakeOff(this);
        location = null;
    }

}
