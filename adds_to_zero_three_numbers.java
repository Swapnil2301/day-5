import java.util.Scanner;
public class adds_to_zero_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print size of list");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i =0;i<size;i++){
            System.out.println("enter elements");
            array[i]=sc.nextInt();
        }
    }
}
