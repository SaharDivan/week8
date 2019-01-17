package Lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class PowerLevelScouter {

    public Integer scout(String name, Function<String,Integer> powerRule){
        List<String> letters = Arrays.asList(name.split(""));
        Integer sum = 0;
        for (String letter : letters) {
            sum += powerRule.apply(letter);
        }
       return sum;
    }

  //  Function<String,Integer> power = s->(int)s.charAt(0);
  //  Function<String,Integer> powerEnhanced = s->(int)s.toLowerCase().charAt(0);


}
