

public class moveAll {
    public static void moveAllx(String src , int idx, StringBuilder result , int count){


        if(src.length()==idx){
            for(int i=0;i<count;i++){
                result.append('x');
            }
            return;
        }

        char ch = src.charAt(idx);
        if(ch == 'x'){
            count++;
            moveAllx(src, idx + 1, result, count);
        } else {
            result.append(ch);
            moveAllx(src, idx + 1, result, count);
        }
    }

    public static void main(String[] args) {
        String src = "axbcxxdxxe";
        StringBuilder result = new StringBuilder();
        moveAllx(src, 0, result, 0);
        System.out.println("Result after moving all 'x': " + result.toString());
    }
}
