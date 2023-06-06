package FileHandling;
import java.io.*;

class countWords{
    static boolean checkPalin(String s){
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i)!=s.charAt(n-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        File ob = new File("FileHandling/myFile.txt");
        ob.createNewFile();
        FileReader reader = new FileReader(ob);
        BufferedReader br = new BufferedReader(reader);
        String line; int count=0;
        while((line=br.readLine())!=null){
            String words[] = line.split("\\s+");
            count+=words.length;
            for(int i=0; i<words.length; i++){
                if(checkPalin(words[i])==true){
                    System.out.println(words[i]);
                }
            }
        }
        System.out.println(count);
        reader.close();
        br.close();
    }
}