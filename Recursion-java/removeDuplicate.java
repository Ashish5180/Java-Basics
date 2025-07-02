public class removeDuplicate {
    
    public static String removeDuplicates(String str, boolean present[], int idx) {
        if (str.length() == idx) {
            return "";
        }

        char ch = str.charAt(idx);
        if (present[ch - 'a']) {
            return removeDuplicates(str, present, idx + 1);
        } else {
            present[ch - 'a'] = true;
            return ch + removeDuplicates(str, present, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "tanunu"; // Use only lowercase here
        boolean present[] = new boolean[26]; // for 'a' to 'z'
        System.out.println(removeDuplicates(str, present, 0));
    }
}


