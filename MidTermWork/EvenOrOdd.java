package MidTermWork;

import java.io.*;

public class EvenOrOdd {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());

        if(n%2==0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}