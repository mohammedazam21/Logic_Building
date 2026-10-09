import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number");
        int num=sc.nextInt();

        int sq=num*num;
        int sum=0;

        while(sq!=0){
            int ld=sq%10;
            sum=sum+ld;
            sq/=10;
        }
        System.out.println((sum==num)?"Neon Number":"Not a Neon Number");
    }
}
