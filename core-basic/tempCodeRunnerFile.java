
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        
        // Decalre and find element in 2d array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.println("The elements of the 2D array are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
