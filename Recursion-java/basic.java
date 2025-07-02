public class basic{

    public static void towerHanoi(int n , String src , String help , String dest){


        if(n==0){
            return;
        }

        // Move n-1 disks from source to helper
        towerHanoi(n-1, src, dest, help);

        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        towerHanoi(n-1, help, src, dest);
    }

    public static void main(String[] args) {
        int n=3;
        String src = "A";
        String help = "B";  
        String dest = "C";

        towerHanoi(n, src, help, dest);
    }
}