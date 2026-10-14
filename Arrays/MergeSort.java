import java.util.*;
public class MergeSort {

    public static void divide(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;

            divide(arr, low, mid);
            divide(arr, mid+1, high);
            conquere(arr, low,mid,high);
        }
        
    }
    public static void conquere(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int leftArr[]=new int[n1];
        int rightArr[]=new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            rightArr[i]=arr[mid+1+i];
        }


        //Merge

        int i=0;int j=0; int k=low;
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={12,89,34,9,123,45,99};
        divide(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
