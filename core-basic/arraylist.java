import java.util.ArrayList;

public class arraylist{
    
    public static void main(String[] agrs){
        ArrayList<String> movies = new ArrayList<>();
     
     movies.add("Reacher");
     movies.add("Lucifer");
     movies.add("Wednesday");
     movies.add("Superman");
     
     System.out.println(movies);
     
     movies.set(0 , "Chorii");
     movies.remove(2);
     System.out.println(movies);
    }
     
     
    
}