package MidTermWork;

import java.util.Scanner;

public class fibonacci {
    static long fibo(long a){
        if(a<=2)
            return 1;
        else
            return fibo(a-1)+fibo(a-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        long n = sc.nextInt();
        long ans = fibo(n);
        System.out.println("The nth term of series: "+ans);
        sc.close();
    }
}
