package Unit11.Unit11Task3;

import java.io.*;

import static Unit11.Unit11Task3.TextFormatter2.*;

public class Run {
    public static void main(String[] args) throws IOException {
            try (BufferedReader br = new BufferedReader(new FileReader("src/Unit11/Unit11Task3/text.txt"))) {
                int counter = 0;
                String sentence ="";
                int symbol;
                while((symbol = br.read())!=-1) {
                    sentence += (char) symbol;
                    if (symbol == '.') {
                        if(hasForbiddenWords(sentence)){
                            System.out.println(sentence);
                            counter++;
                        }
                        sentence = "";
                    }
                }
                System.out.println("Количество предложений с цензурой - " + counter);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

