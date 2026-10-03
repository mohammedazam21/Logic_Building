import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first point to start ");
        int a=sc.nextInt();
        System.out.println("ENter the second point to start");
        int b=sc.nextInt();
        System.out.println("Enter the number of series ");
        int s=sc.nextInt();

        System.out.println("The fibonacci series are :");


        for(int i=a;i<=s;i++){
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }

}
