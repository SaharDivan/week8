package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {


    public List<Integer> filterNums(Predicate<Integer> condition, List<Integer> mixedNumbrs) {
        List<Integer> filteredNums=new ArrayList<>();
        for (Integer num:mixedNumbrs) {
            if (condition.test(num)) {
                filteredNums.add(num);
            }
        }
        System.out.println(filteredNums);
        return filteredNums;
    }

     List<Integer> getEven(List<Integer> mixedNumbrs){
        Predicate<Integer> conditionEven = integer -> integer % 2 == 0;
    return filterNums(conditionEven,mixedNumbrs);
    }


     List<Integer> getOdd(List<Integer> mixedNumbers){
        Predicate<Integer> conditionOdd = integer -> integer % 2 == 1;
        return filterNums(conditionOdd,mixedNumbers);
    }
}
