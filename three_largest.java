import java.util.Scanner;
public class three_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("biggest number is" + a);
        }
        if(b>a && b>c){
            System.out.println("Biggest number is "+ b);
        }
        if(c>a && c>b){
            System.out.println("biggest number is " + c);
        }
    }
}
