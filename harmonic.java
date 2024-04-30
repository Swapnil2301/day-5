
import java.util.Scanner;
public class harmonic {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int user_input = sc.nextInt();
        double ans = 0;
        for(int i =1;i<=user_input;i++){
            ans = ans + (1.0/i);

        }
        System.out.println(ans);
    }
}
