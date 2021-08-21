package Unit11.Unit11Task2;

import java.security.SecureRandom;

public class TextFormatter {
    public static int countWords(String sentence){
        sentence = format(sentence);
        String [] words = sentence.split(" ");
        return words.length;
    }

    public static boolean hasPalindrome(String sentence){
        sentence = format(sentence);
        String [] words = sentence.split(" ");
        for(int i = 1; i<words.length; i++){
            StringBuffer sb = new StringBuffer(words[i]);
            String check = sb.reverse().toString();
            if(words[i].equals(check)){
                return true;
            }
        }
        return false;
    }

    public static String format(String sentence){
        sentence = sentence.replace("\r\n", " ");
        sentence = sentence.replace(',', ' ');
        sentence = deleteDelimiters(sentence);
        sentence = sentence.replace('.', ' ');
        return sentence;
    }

    private static String deleteDelimiters(String sentence) {
        StringBuilder stringBuilder = new StringBuilder(sentence);
        int firstIndex;
        int secondIndex = 0;
        if(stringBuilder.charAt(0) == ' '){                  //удаление в начале
            while (stringBuilder.charAt(secondIndex)==' '){
                secondIndex ++;
            }
            stringBuilder.delete(0, secondIndex);
        }
        for (int i = 0; i < stringBuilder.length(); i++) {  //в середине
            if (stringBuilder.charAt(i) == ' ') {
                firstIndex = ++i;
                while (stringBuilder.charAt(i) == ' ') {
                    i++;
                }
                if (i != firstIndex) {
                    secondIndex = i;
                    stringBuilder.delete(firstIndex, secondIndex);
                    i = firstIndex;
                }
            }
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '.') { //перед точкой
            secondIndex = stringBuilder.length() - 1;
            firstIndex = stringBuilder.length() - 2;
            while (stringBuilder.charAt(firstIndex) == ' ') {
                firstIndex--;
            }
            stringBuilder.delete(++firstIndex, secondIndex);
        }
        return stringBuilder.toString();
    }
}
