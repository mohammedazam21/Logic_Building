import java.util.*;
public class CountNumberOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Count digits");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        while(num!=0){
             count++;
             num/=10;
        }
        System.out.println("The count of " + temp + " is "+ count);
    }
        

}
