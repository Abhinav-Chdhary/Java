package BasicIO;

import java.util.Scanner;

public class OpBubbleSort {
    public void bubbleSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int flag=0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0) break;
        }
    }
    void display(int arr[], int n){
        System.out.println("The array is: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the length of array");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        OpBubbleSort ob = new OpBubbleSort();
        ob.bubbleSort(arr, n);
        ob.display(arr, n);
        sc.close();
    }
}
