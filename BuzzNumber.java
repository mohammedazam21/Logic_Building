import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number");
        int num=sc.nextInt();

        if(num%10==7 || num%7==0){
            System.out.println("Buzz Number");
        }
        else
            System.out.println("Not a Buzz Number");
    }
}
