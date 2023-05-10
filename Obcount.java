import java.util.*;

public class Obcount {
    static int count=0;
    void show(){
        System.out.println(count);
    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        while(choice==1){
            System.out.println("Object created");
            Obcount ob = new Obcount();
            count++;
            System.out.println("count="+ob.count);
            System.out.println("Enter choice 1 to create more else any to not");
            choice = sc.nextInt();
        }
        sc.close();
    }
}
