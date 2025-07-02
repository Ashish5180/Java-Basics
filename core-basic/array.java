import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //      int numbers[] = new int[sc.nextInt()];
    //     System.out.println("Enter the elements of the array:");
    //     for(int i=0;i<numbers.length;i++){
    //         numbers[i]=sc.nextInt();
    //     }


    //   System.out.println("Enter the element to search: ");
    //     int x = sc.nextInt();

    //     for(int i=0;i<numbers.length;i++){
    //         if(numbers[i] == x){
    //             System.out.println("Element found at index: " + i);
    //             return; 
    //         }
    //     }
        // System.out.print("The elements of the array are: ");
        // for(int i =0;i<numbers.length;i++){
        //     System.out.print(numbers[i] + " ");
        // }




        // // Max and min value in an array

        // System.out.print("Enter the size of the array: ");
        // Scanner sc = new Scanner(System.in);
        // int numbers[] = new int[sc.nextInt()];
        // System.out.println("Enter the elements of the array:");

        // for(int i=0;i<numbers.length;i++){
        //     numbers[i]=sc.nextInt();
        // }

        // int max  = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]>max){
        //         max = numbers[i];
        //     }
        //     if(numbers[i]<min){
        //         min = numbers[i];
        //     }
            
        // }

        // System.out.println("The maximum value in the array is: " + max);
        // System.out.println("The minimum value in the array is: " + min);
        


        // Acsending and Descending order of an array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int numbers[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array:");

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();


        }

        System.out.print("The elements of the array are: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
         System.out.println();
        
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<numbers[i-1]){
                isAscending = false;
            }
            if(numbers[i]>numbers[i-1]){
                isDescending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is in ascending order.");
        } else if(isDescending) {
            System.out.println("The array is in descending order.");
        } else {
            System.out.println("The array is neither in ascending nor descending order.");
        }
        

    }
}
