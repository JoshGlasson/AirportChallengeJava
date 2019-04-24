package AirportChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {

    Weather weather = new Weather();

    @Test
    void returnsTrueForStormy() {
        assertTrue(weather.isStormy(91));
    }

    @Test
    void returnsFalseForNotStormy() {
        assertFalse(weather.isStormy(1));
    }
}