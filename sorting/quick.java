

class quick {
    
    public static int partition(int[] arr , int low, int high){
        int pivot = arr[high];
        int i= low-1; // intial value when space is no needed
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
           
            
        }
        
         i++;
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            return i;
    }
    
    public static void quickSort(int[] arr , int low, int high){
        if(low<high){
            int pi = partition(arr ,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {2,8,6,4,9};
        int n = arr.length;
        
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
    


}