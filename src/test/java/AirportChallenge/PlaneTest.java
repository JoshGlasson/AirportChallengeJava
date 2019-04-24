package AirportChallenge;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlaneTest {

    Plane plane = new Plane();
    Airport mockedAirport = mock(Airport.class);

    @Test
    void canTakeOffFromAirport() {
        plane.land(mockedAirport);
        plane.takeOff();
        verify(mockedAirport).clearForTakeOff(plane);
    }

    @Test
    void canLandAtAirport() {
        plane.land(mockedAirport);
        verify(mockedAirport).clearForLanding(plane);
    }
}