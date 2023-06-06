/*Five Bikers Compete in a race such that they drive at a constant speed 
which may or may not be the same as the other. To qualify the race, the
speed of a racer must be more than the average speedof all 5 racers.
Take as input the speed of each racer and print backthe speed of
qualifying racers. */
import java.util.Scanner;

class Biker{
    int speed;
    Biker(){
        speed=0;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return speed;
    }
}
public class FiveBikers {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        //creating array of 5 bikers
        Biker bikers[] = new Biker[5];
        //----input----
        double avg = 0.0;
        for (int i = 0; i < 5; i++) {
            int s = sc.nextInt();
            Biker b = new Biker();
            b.setSpeed(s);
            bikers[i] = b;
            avg+=s;
        }
        avg /= 5.0;
        //----qualifying racers----we
        System.out.println("average = "+avg);
        for (int i=0; i<5; i++) {
            if(bikers[i].getSpeed()>avg){
                System.out.println((i+1)+"racer qualified");
            }
        }
        sc.close();
    }
}
