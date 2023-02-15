package BasicIO;

import java.io.*;

public class LargestOfThree {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        System.out.println("Enter first num");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        System.out.println("Max number is: "+Math.max(a, Math.max(b, c)));
    }
}
