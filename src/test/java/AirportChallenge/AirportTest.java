package AirportChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AirportTest {

    Airport airport = new Airport();
    Plane mockedPlane = mock(Plane.class);

    @Test
    void hasNoPlanesByDefault() {
        assertEquals(0, airport.getPlanes().size());
    }

    @Test
    void planesCanLandAtAirport() {
        airport.weather = false;
        airport.clearForLanding(mockedPlane);
        assertEquals(1, airport.getPlanes().size());
        airport.getPlanes().remove(0);
    }

    @Test
    void planesCanTakeOffFromAirport(){
        airport.weather = false;
        airport.clearForLanding(mockedPlane);
        assertEquals(1, airport.getPlanes().size());
        airport.clearForTakeOff(mockedPlane);
        assertTrue(airport.getPlanes().isEmpty());
    }

    @Test
    void cannotLandInStorm(){
        airport.weather = true;
        assertEquals("Can't land in a storm", airport.clearForLanding(mockedPlane));
    }

    @Test
    void cannotTakeOffStorm(){
        airport.weather = false;
        airport.clearForLanding(mockedPlane);
        airport.weather = true;
        assertEquals("Can't take off in a storm", airport.clearForTakeOff(mockedPlane));
    }

}
