import java.util.Scanner;

public class Armstrong {

    public static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static boolean checkArmstrong(int num){
        int temp=num;
        int count=count(num);
        int sum=0;
        while(num!=0){
            int ld=num%10;
            sum=sum+(int)Math.pow(ld, count);
            num/=10;
        }
        return temp==sum;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int num=sc.nextInt();

        System.out.println(checkArmstrong(num)?"Armstrong Number":"Not a Armstrong Number");
    }
}
