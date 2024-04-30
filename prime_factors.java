import java.util.Scanner;
public class prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int user_input = sc.nextInt();

        System.out.println("Prime factors of " + user_input + ": ");

        for (int i = 2; i <= user_input; i++) {
            while (user_input % i == 0) {
                System.out.print(i + " ");
                user_input /= i;
            }
        }
    }
}
