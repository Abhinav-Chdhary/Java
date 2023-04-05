package TermWork;
import java.util.*;

public class Factorial {
    static long fact(int a){
        if(a<2)
            return 1;
        else
            return a*fact(a-1);

    }
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();
        long fact = fact(a);
        System.out.println("Factorial of "+a+" = "+fact);
        sc.close();
    }
}
