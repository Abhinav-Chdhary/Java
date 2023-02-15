package CLIinput;

public class Prime {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int flag=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("NO not a prime number");
        else
            System.out.println("Yes it is a prime number");
    }
}
