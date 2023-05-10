import java.util.*;

public class Candidate{
    String name;
    int votes;
    float percent;

    Candidate(){
        name="";
        votes=0;
        percent=0.0f;
    }
    Candidate(String nm, int v){
        name = nm;
        votes = v;
    }
    void calPercent(int total){
        percent = ((float)votes/total)*100;
    }
    public static void main(String sr[]){
        Scanner scanner = new Scanner(System.in);
        Candidate candidate[] = new Candidate[5];
        System.out.println("Enter:");
        int total=0;
        for(int i=0; i<5; i++){
            String nm; int v;
            nm = scanner.nextLine();
            v = scanner.nextInt();
            scanner.nextLine();
            Candidate temp = new Candidate(nm, v);
            candidate[i] = temp;
            total+=v;
        }
        for(int i=0; i<5; i++){
            candidate[i].calPercent(total);
        }
        Candidate winner = candidate[0];
        for(int i=1; i<5; i++){
            if(candidate[i].percent>winner.percent)
                winner=candidate[i];
        }
        System.out.println("Winner: "+winner.name);
        scanner.close();
    }
}