public class recusrion2 {

    public static int first = -1;
    public static int last = -1;

    public static void getIndexes(String str , char ele , int idx){

        if(str.length()==idx){
            return;
        }

        if(str.charAt(idx) == ele){
            if(first==-1){
                first=idx;
            }
            last=idx;
        }
        getIndexes(str, ele, idx + 1);

    }

    public static void main(String[] args) {
        String str = "hello world";
        char ele = 'o';
        getIndexes(str, ele, 0);
        System.out.println("First occurrence of '" + ele + "': " + first);
        System.out.println("Last occurrence of '" + ele + "': " + last);
    }
}
