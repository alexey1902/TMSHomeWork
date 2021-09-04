package Unit11.Unit11Task2;

import java.io.*;
import static Unit11.Unit11Task2.TextFormatter.*;

public class Run {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("src/Unit11/Unit11Task2/file.txt"))) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Unit11/Unit11Task2/file2.txt"));
            String sentence ="";
            int symbol;
            while((symbol = br.read())!=-1) {
                sentence += (char) symbol;
                if (symbol == '.') {
                    if (countWords(sentence) >= 3 && countWords(sentence) <= 5 || hasPalindrome(sentence)) {
                        bw.write(sentence + '\n');
                        bw.flush();
                    }
                    sentence = "";
                }
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
