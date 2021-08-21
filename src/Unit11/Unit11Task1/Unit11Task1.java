package Unit11.Unit11Task1;

import java.io.*;

public class Unit11Task1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Unit11/Unit11Task1/file.txt"))) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Unit11/Unit11Task1/file2.txt"));
            String word;
            StringBuffer sb;
            while((word = br.readLine())!=null){
                  sb = new StringBuffer(word);
                  String sb2 = sb.reverse().toString();
                  if(word.equals(sb2)){
                      bw.write(word + "\n");
                  }
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
