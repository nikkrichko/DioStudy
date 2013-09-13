package luxoftTest.Reverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "world", "today", "is", "good"};
        System.out.println(Arrays.toString(words));
        System.out.println(Reverse.reverseAndConcaterate(words));
    }
}
class Reverse {

    public static String reverseAndConcaterate(String[] words){
        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < words.length; i++){
            stringResult.append(reverseWord(words[i]));
            stringResult.append(" ");
        }

        return stringResult.toString();
    }

    private static String reverseWord(String word){
        StringBuilder wordResult = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--){
            wordResult.append(word.charAt(i));
        }
        return wordResult.toString();
    }


}
