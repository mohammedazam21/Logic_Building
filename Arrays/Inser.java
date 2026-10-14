package Arrays;
import java.util.*;
public class Inser {
    public static int[] inse(int arr[]){
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>ele){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=ele;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,65,9,36};
        inse(arr);
        System.out.println(Arrays.toString(arr));
        }
}
