
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


        // Spiral order of 2D array

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        System.out.println("Spiral order of the 2D array:");
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.print(numbers[top][i]+" ");
            }
            top++;

            for(int i = top;i<=bottom;i++){
                System.out.print(numbers[i][right]+" ");
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(numbers[bottom][i]+" ");
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i++){
                    System.out.print(numbers[i][left]+" ");
                }
                left++;
            }
        }

















        // // Search for an element in 2D array
        // System.out.print("Enter the element to search: ");
        // int x = sc.nextInt();
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(numbers[i][j]==x){
        //             System.out.println("Element found at index: (" + i + ", " + j + ")");
        //             return; 
        //         }
        //     }
        // }
        // System.out.println("Element not found in the array.");

    }
}
