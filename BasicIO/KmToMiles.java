package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KmToMiles {
    public static void main(String ar[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of kilometers");
        int km = Integer.parseInt(br.readLine());
        
        float mi = km*0.62f;
        System.out.println("Converted into miles: "+mi);
    }
}
