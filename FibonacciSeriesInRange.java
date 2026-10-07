import java.util.Scanner;

public class FibonacciSeriesInRange {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range ");
        int range=sc.nextInt();

        int a=0;int b=1;

        for(int i=a;i<range;i++){
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
