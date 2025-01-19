package Searching;

public class LinearSearch {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 5;

        System.out.println(" K is found at " + linearSearch( arr, k));
                
    }
        
    private static int linearSearch(int[] arr, int k) {

        int l = arr.length;
        
        for(int i = 0 ; i < l ; i++){

            if(arr[i] == k){
                return i;
            }

        }

        return -1;
    }
    
}
