package Arrays;
import java.util.*;
public class Selection {
    public static int[] sel(int arr[]){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
           int temp=arr[i];
           arr[i]=arr[index];
           arr[index]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,633,9,68,5};
        sel(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
