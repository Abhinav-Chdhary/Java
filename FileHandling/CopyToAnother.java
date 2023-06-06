package FileHandling;

import java.io.*;

public class CopyToAnother {
    public static void main(String ar[])throws IOException{
        File ob1 = new File("FileHandling/myFile1.txt");
        ob1.createNewFile();
        File ob2 = new File("FileHandling/myFile2.txt");
        ob2.createNewFile();
        FileReader reader = new FileReader(ob1);
        FileWriter writer = new FileWriter(ob2);
        BufferedReader br = new BufferedReader(reader);
        String line; int count=0;
        while((line=br.readLine())!=null){
            writer.write(line+"\n");
        }
        System.out.println(count);
        reader.close();
        br.close();
        writer.close();
    }
}
