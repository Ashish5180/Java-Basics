import java.util.Scanner;

public class menuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks > 90) {
                System.out.println("A");
            } else if (marks > 80) {
                System.out.println("B");
            } else if (marks > 70) {
                System.out.println("C");
            } else if (marks > 60) {
                System.out.println("D");
            } else if (marks > 50) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }

            System.out.print("Enter 1 to continue, any other key to exit: ");
            input = sc.nextInt();  

        } while (input == 1);

        sc.close(); // scanner close karna good practice hai
    }
}
