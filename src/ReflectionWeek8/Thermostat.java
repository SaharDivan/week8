package ReflectionWeek8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    private Double them;

    public Thermostat(Double them) {
        this.them = them;
    }

    Predicate<Double> conditionMin=them -> them<0;
    Predicate<Double> conditionMax=them -> them>80;

    Function<Double,String> display= them->them+" degree Celsius";

    public String sense(Double them,Predicate condition){
        if(condition.test(them)){
           return "Warning!";}
           else{
            System.out.println(display.apply(them));
            return display.apply(them);
        }
    }

}
