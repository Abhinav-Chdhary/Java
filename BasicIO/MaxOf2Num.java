package BasicIO;
import java.io.*;

public class MaxOf2Num {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter 2 numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(Math.max(a, b)+" is the greatest\n");
    }
}
