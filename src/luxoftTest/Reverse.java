package luxoftTest;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 11.09.13
 * Time: 08:12
 * To change this template use File | Settings | File Templates.
 */
public class Reverse {


    private static String reverseWord(String word){
        StringBuilder wordResult = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--){
            wordResult.append(word.charAt(i));
        }
        return wordResult.toString();
    }

    public static String reverseStrings(String[] words){
        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < words.length; i++){

            stringResult.append(reverseWord(words[i]));
            stringResult.append(" ");
        }

        return stringResult.toString();
    }
}
