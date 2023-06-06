package MidTermWork;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayZigZag {
    public void zigger(int arr[], int n){
        for(int i=1; i<n-1;){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i += 2;
        }
    }
    public void display(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];
        System.out.println("Enter any 10 integers:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayZigZag ob = new ArrayZigZag();
        ob.zigger(arr, n);
        ob.display(arr, n);
        sc.close();
    }
}
