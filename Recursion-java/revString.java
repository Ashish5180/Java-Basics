public class revString {

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverse(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
