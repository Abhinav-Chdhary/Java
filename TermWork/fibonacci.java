package TermWork;

import java.util.Scanner;

public class fibonacci {
    static int fibo(int a){
        if(a<=2)
            return 1;
        else
            return fibo(a-1)+fibo(a-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println("The nth term of series: "+ans);
        sc.close();
    }
}
