package CLIinput;

public class Armstrong {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int sum = 0, ncop = n;
        while (ncop!=0) {
            int d=ncop%10;
            sum+= (d*d*d);
            ncop/=10;
        }
        if(sum==n)
            System.out.println("Yes it is Armstrong");
        else    
            System.out.println("No not an Armstrong");
    }
}
