import java.util.Scanner;
public class swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a: ");
        int a  = sc.nextInt();
        System.out.println("Entet  number b; ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
