public class arrIncreasing {
     
    public static boolean isIncreasing(int arr[],int idx){

        if(idx == arr.length - 1){
            return true; 
        }
        if(!isIncreasing(arr, idx+1)){
            return false;
        }

        return arr[idx]<arr[idx+1];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        boolean result = isIncreasing(arr, 0);
        System.out.println("Is the array increasing? " + result);
    } 



}
