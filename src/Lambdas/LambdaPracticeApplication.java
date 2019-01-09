package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPracticeApplication {

    public static void main(String[] args) {

        //------------------------------Exe1

        System.out.println("---Original List:");
        List<String> words = new ArrayList<>();
        words.add("Sahar");
        words.add("Saba");
        words.add("Raha");
        words.add("Able");
        words.add("Table");
        words.add("Sahara");
        words.add("Dalaylama");
        System.out.println(words);

        System.out.println();
        System.out.println("---Filtered List by Ending:");
        words.removeIf(e -> e.endsWith("e"));
        System.out.println(words);

        System.out.println();
        System.out.println("---Replace by uppercase:");
        words.replaceAll(e -> e.toUpperCase());
        System.out.println(words);


        System.out.println();
        System.out.println("---Filtered by number of letters <6:");
        words.removeIf(e -> e.length() < 6);
        System.out.println(words);

        System.out.println();
        System.out.println("---Looped");
        words.forEach(e -> System.out.println(e));

        //--------------------------------------Exe2

        List<Integer> mixedNums = makeAListOfMixedNumbers();
        NumberFilter filter = new NumberFilter();
        filter.getEven(mixedNums);
        filter.getOdd(mixedNums);

        //--------------------------------------Exe3

        String text=getTheText();
        KeyWordFinder finder = new KeyWordFinder();
        finder.getElegant(text);
        finder.getPlayFull(text);


        //--------------------------------------Exe4


    }




    private static String getTheText() {
        return "The elephant is lifted eleven floors"+
                " easily with the help of an electricity elevator"+
                "The rightful heir of the powerful king had an " +
                "awful accident playing with a colorful bear";
    }


    private static List<Integer> makeAListOfMixedNumbers() {

        List<Integer> mixedNumbers = new ArrayList<>
                (Arrays.asList(2, 5, 27, 4, 6, 57, 75, 23, 32));
        return mixedNumbers;
    }

}
