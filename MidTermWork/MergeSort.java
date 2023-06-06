package MidTermWork;

import java.util.Scanner;

public class MergeSort {
    
    /* Function to print an array */
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void merge(int arr[], int l, int mid, int r) {
        int i = 0, j = 0, k = l;
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        //copy first half to L
        for (i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        //copy second half to R
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        i = 0; j = 0; k = l;
        //comparing and putting in
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //left over elements of first half
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //left over elements of second half
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        printArray(arr, n);

        input.close();
    }
}

