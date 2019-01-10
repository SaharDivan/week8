package Lambdas;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    @Test
    void scout() {
        PowerLevelScouter powerLevelScouter =new PowerLevelScouter();
        Function<String,Integer> power = s->(int)s.charAt(0);

        Integer actual=powerLevelScouter.scout("Susana", power);
        System.out.println(actual);
        assertEquals(619,actual);
    }
    @Test
    void scoutEnhanced() {
        PowerLevelScouter powerLevelScouter =new PowerLevelScouter();
        Function<String,Integer> powerEnhanced= s->(int)s.toLowerCase().charAt(0);

        Integer actual=powerLevelScouter.scout("Susana", powerEnhanced);
        System.out.println(actual);
        assertEquals(651,actual);
    }
}