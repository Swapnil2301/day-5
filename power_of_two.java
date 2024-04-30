
import java.util.Scanner;
public class power_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between o and 31");
        int user_input = sc.nextInt();
        int base = 1;
        if(user_input ==1){
            System.out.println(2);
            return;

        }
        for (int i =1;i<=user_input;i++){
            base = base * 2;
            System.out.print(base + " ");
        }
    }
}
