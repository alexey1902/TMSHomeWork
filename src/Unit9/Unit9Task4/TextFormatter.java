package Unit9.Unit9Task4;

public class TextFormatter {

    public static String toNormalCondition(String sentence){
        sentence = sentence.trim();
        sentence = sentence.replace("\r\n", " ");
        sentence = deleteDelimiters(sentence);
        System.out.println(sentence);
        return sentence;
    }

    public static String deleteDelimiters(String sentence) {
        StringBuilder stringBuilder = new StringBuilder(sentence);
        int firstIndex;
        int secondIndex;
        for (int i = 0; i < stringBuilder.length(); i++) {
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
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '.') {
            secondIndex = stringBuilder.length() - 1;
            firstIndex = stringBuilder.length() - 2;
            while (stringBuilder.charAt(firstIndex) == ' ') {
                firstIndex--;
            }
            stringBuilder.delete(++firstIndex, secondIndex);
        }
        return stringBuilder.toString();
    }

    public static int getWords(String sentence) {
        int wordsCounter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordsCounter++;
            }
        }
        return ++wordsCounter;
    }

    public static boolean hasPalindrome(String sentence) {
        int firstIndex = 0;
        int secondIndex = 0;
        StringBuffer stringBuffer;
        while(secondIndex!=sentence.length()) {
            while (sentence.charAt(secondIndex) != ' ') {
                if (sentence.charAt(secondIndex) == '.' || secondIndex == sentence.length() - 1) {
                    break;
                }
                secondIndex++;
            }
            stringBuffer = new StringBuffer(sentence.substring(firstIndex, secondIndex));
            String bufString = stringBuffer.toString();
            if (bufString.equalsIgnoreCase(stringBuffer.reverse().toString())) {
                return true;
            }
            firstIndex = ++secondIndex;
        }
        return false;
    }


}
