package ReflectionWeek8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    @Test
    void senseSkiingSafe() {

        Thermostat thermostat = new Thermostat(0.0);
        String expectedSafe=thermostat.sense(2.0,thermostat.conditionMin);
        String actual="2.0 degree Celsius";

        assertEquals(expectedSafe,actual);
    }
    @Test
    void senseSkiingWarning() {

        Thermostat thermostat = new Thermostat(0.0);
        String expectedWarning=thermostat.sense(-1.0,thermostat.conditionMin);
        String actual="Warning!";

        assertEquals(expectedWarning,actual);
    }
    @Test

    void senseSaunaSafe() {

        Thermostat thermostat = new Thermostat(80.0);
        String expectedSafe=thermostat.sense(79.0,thermostat.conditionMin);
        String actual="79.0 degree Celsius";

        assertEquals(expectedSafe,actual);
    }
    @Test
    void senseSaunaWarning() {

        Thermostat thermostat = new Thermostat(80.0);
        String expectedWarning=thermostat.sense(81.0,thermostat.conditionMax);
        String actual="Warning!";

        assertEquals(expectedWarning,actual);
    }
}