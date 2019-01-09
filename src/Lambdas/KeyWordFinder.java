package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeyWordFinder {

    public List<String> findTheWord(Predicate<String> condition,String text){
        List<String> filtedWords = new ArrayList<>();
        String[] mixedWords = text.split(" ");
        for (String word:mixedWords) {
           if(condition.test(word)){
               filtedWords.add(word);
           }
        }
        System.out.println(filtedWords);
        return filtedWords;
    }


     List<String> getElegant(String mixedWords){
        Predicate<String> elegantWord=s -> s.contains("ele");
        return findTheWord(elegantWord,mixedWords);

    }

     List<String> getPlayFull(String mixedWords){
        Predicate<String> playfulWord=s -> s.contains("ful");
        return findTheWord(playfulWord,mixedWords);
    }


}
