package Unit9.Unit9Task4;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static Unit9.Unit9Task4.TextFormatter.*;

public class Run {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("[!.?]");
        Matcher matcher;
        String str = "";
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/WorkSpace/HomeWork/src/Unit9/text2.txt"));
        try(BufferedReader br = new BufferedReader (new FileReader("D:/WorkSpace/HomeWork/src/Unit9/text.txt")))
        {
            int symbol;
            while((symbol=br.read())!=-1){
                str += (char) symbol;
                matcher = pattern.matcher(str);
                if(matcher.find()) {  //if(symbol == '.') {  //конец предложения
                    str = toNormalCondition(str);
                    if(getWords(str)>=3 && getWords(str)<=5 || hasPalindrome(str)){
                        bw.write(str +  '\n');
                        bw.flush();
                    }
                    str = "";
                }
            }
            str = toNormalCondition(str);  //если последнее предложение без точки
            if(getWords(str)>=3 && getWords(str)<=5 || hasPalindrome(str)){
                bw.write(str +  '\n');
                bw.flush();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
