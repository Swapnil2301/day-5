import java.lang.Math;
import java.util.Scanner;
public class coin_flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print Number of time to flip Coin: ");
        int n_flip = sc.nextInt();
        int head =0;
        int tail = 0;
        for(int i = 0;i<n_flip;i++){
            double flip = Math.random();
            //System.out.println(flip);
            if(flip>.5){

                head++;
            }
            else{
                tail++;
            }
        }
        float head_per = ((float)head/n_flip) *100;
        float tail_per = ((float)tail/n_flip) * 100;
        System.out.println("Percentage of head is " + head_per);
        System.out.println("Percentage of tail is " + tail_per);


    }
}
