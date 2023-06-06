import java.util.Scanner;

public class SumOfMatrices {
    static void takeInput(int arr[][], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    static int[][] sum(int matA[][], int matB[][], int n){
        int res[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[i][j] = matA[i][j]+matB[i][j];
            }
        }
        return res;
    }
    static void display(int arr[][], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrices");
        int n = sc.nextInt();
        int matA[][] = new int[n][n];
        int matB[][] = new int[n][n];
        int res[][] = new int[n][n];
        System.out.println("First mat");
        takeInput(matA, n);
        System.out.println("Second mat");
        takeInput(matB, n);
        res = sum(matA, matB, n);
        display(res, n);
        sc.close();
    }
}
