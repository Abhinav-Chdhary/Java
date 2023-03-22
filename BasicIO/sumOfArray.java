package BasicIO;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        int n, sum=0, myMax=Integer.MIN_VALUE;
        System.out.println("Enter the length of array");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            myMax = Math.max(myMax, arr[i]);
        }
        System.out.println("The array is: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Sum="+sum);
        System.out.println("Max="+myMax);
        sc.close();
    }
}
