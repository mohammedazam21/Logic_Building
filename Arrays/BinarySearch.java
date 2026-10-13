package Arrays;
import java.util.*;
public class BinarySearch {
    public static boolean binary(int arr[],int key){
        int low=0;
        int high=arr.length-1; 
        
        while(low<=high){
            int mid=(low+high)/2;

            if(key==arr[mid])
                return true;
            else if(key<arr[mid])
                high=mid-1;
            else 
                low=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={14,89,47,63,12};
        Arrays.sort(arr);
        int key=1;

        System.out.println(binary(arr, key));
        
    }
}
