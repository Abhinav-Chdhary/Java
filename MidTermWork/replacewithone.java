package MidTermWork;

import java.util.Scanner;

public class replacewithone {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String of digits");
        String s = sc.nextLine();

        s = s.replace('0', '1');
        System.out.println("New String: "+s);
        sc.close();
    }
}
