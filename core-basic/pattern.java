public class pattern {
    public static void main(String[] args) {
        
        // solid reactangle pattern
        // int n= 5;

        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Hollow Rectangle Pattern
        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j = 1 ;j<=n;j++){
        //         if( i==1 || i ==n || j==1 || j==n){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pyramid Pattern

        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Inverted Pyramid Pattern
        //  int n = 5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 180 degree pyramid
        //  int n = 5;
        // for(int i=1;i<=n;i++){    // inveted pyramid condition =>  int i=n;i>=1;i--
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // Half no. pyramid with numbers
        // This pattern prints numbers in increasing order in each row
        //   int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Reverse order
        //   int n = 5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // 180 degree pyramid with numbers
        //  int n = 5;
        // for(int i=1;i<=n;i++){

        //     for(int j =1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);  // if i pur space i will be full number pyramid  => ("*"+" ")
        //     }
        //     System.out.println();
        // }


        // Floyd's Triangle
        // This pattern prints numbers in increasing order in a triangular format
        //  int n = 5;
        //  int number = 1;
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=i;j++){
        //         System.out.print(number + " "); 
        //         number++;  // increment the number after printing 
        //     }
        //     System.out.println();
        // }




        // 0 , 1 Traingle
        // This pattern prints 0 and 1 in a triangular format
        // int n = 5;
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum % 2 ==0){
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }



        // Solid Rhombus Pattern
        //         int n= 5;

        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

            
        // Same number Pyramid
        // int n= 5;

        // for (int i=1;i<=n;i++){
        //     // Print leading spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


        // Palindromic Pattern
        // int n = 5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=i ; j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
