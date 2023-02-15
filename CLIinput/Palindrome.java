package CLIinput;

public class Palindrome {
    public static void main(String[] args){
        String s=args[0];
        int flag = 0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                flag=1;
        }
        if(flag==1)
            System.out.println("Not a Palindrome");
        else    
            System.out.println("Yes it is palindrome");
    }
}
