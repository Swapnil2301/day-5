import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        char input = sc.next().charAt(0);
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(" is Vowels");
            default:
                System.out.println("it  is Consonant");

        }

    }
}
