package Unit9;

import java.io.*;

public class Unit9Task3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/WorkSpace/HomeWork/src/Unit9/newFile.txt"));
        try(BufferedReader br = new BufferedReader(new FileReader("D:/WorkSpace/HomeWork/src/Unit9/words.txt")))
        {
            StringBuffer s;
            String str, str2;
            while((str = br.readLine())!=null){
                s = new StringBuffer(str);
                str2 = s.reverse().toString();
                s.reverse();
                if(str.equals(str2)){
                   bw.write(str + "\n");
                   bw.flush();
                   System.out.println(s);
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
