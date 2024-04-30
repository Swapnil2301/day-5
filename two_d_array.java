import java.util.Scanner;
public class two_d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows: ");
        int row = sc.nextInt();
        System.out.println("enter number of Coloums: ");
        int col  = sc.nextInt();
        int size = row*col;
        int[][] array = new int[row][col];
        for (int i =0; i <row;i++){
            for(int j=0;j<col;j++ ){
                System.out.println("Enter element for " + i +" row "+j+" coloum");
                array[i][j] =sc.nextInt();
            }

        }
        for(int x =0;x<row;x++){
            for(int y = 0;y<col;y++){
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }

    }
}
