package BasicIO;

import java.util.Scanner;

public class BinarySearch {
    void bs(int arr[], int l, int r, int target){
        if(l<r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                System.out.println("Found at "+(mid+1));
                return;
            }
            else if(arr[mid]>target)
                bs(arr, l, mid, target);
            else
                bs(arr, mid+1, r, target);
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
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        OpBubbleSort bob = new OpBubbleSort();
        BinarySearch sob = new BinarySearch();

        bob.bubbleSort(arr, n);
        sob.bs(arr, 0, n-1, target);
        bob.display(arr, n);
        
        sc.close();
    }
}
