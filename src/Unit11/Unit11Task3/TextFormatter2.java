package Unit11.Unit11Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static Unit11.Unit11Task2.TextFormatter.*;

public class TextFormatter2 {

    public static boolean hasForbiddenWords(String sentence) {

        sentence = format(sentence);
        String[] words = sentence.split(" ");

        try (BufferedReader br = new BufferedReader(new FileReader("src/Unit11/Unit11Task3/blackList.txt"))) {
                String checkWord;
                while ((checkWord = br.readLine()) != null) {
                    for (String word : words) {
                        if (word.equals(checkWord)) {
                            return true;
                        }
                    }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}