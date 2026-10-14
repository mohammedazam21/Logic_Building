import java.util.Arrays;

public class QuickSort {
    public static void divide(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            divide(arr, low, pi-1);
            divide(arr, pi+1, high);
        }
    }
    public static int  partition(int  arr[],int low,int high){
        int pi=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={134,98,78,45,23,100};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
