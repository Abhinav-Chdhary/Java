package CLIinput;

public class Fibo {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int a = 1, b=1, c=0;
        System.out.print(a+", "+b);
        for(int i=2; i<=n; i++){
            c=a+b;
            System.out.print(", "+c);
            a=b;
            b=c;
        }
    }
}
