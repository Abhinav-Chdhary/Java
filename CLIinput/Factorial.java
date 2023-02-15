package CLIinput;

public class Factorial {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int fact=1;
        for(int i=2; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact+" is the factorial of "+n);
    }
}
