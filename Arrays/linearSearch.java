package Arrays;

public class linearSearch {
    public static boolean linear(int arr[],int key){
          for(int i=0;i<arr.length;i++){
            if(key==arr[i])
                return true;
          }
          return false; 
    }
    public static void main(String[] args) {
        int arr[]={14,2,89,74,46,31};
        int key=31;

        System.out.println(linear(arr, key)?"Key found ":"Key not found");
    }
}
