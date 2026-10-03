import java.util.*;
public class ReverseBothTheHalviesOfNumber {
    public static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int power(int base,int exp){
        int pow=1;
        while(exp >0){
            pow*=base;
            exp--;

        }
        return pow;

    }
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Reverse both the halvies");
        int num=sc.nextInt();

        int count=count(num);
        int power=power(10,count/2);

        int fh=num/power;
        int sh=num%power;

        int rfh=reverse(fh);
        int rsh=reverse(sh);

        int reverse=rfh*power+rsh;
        System.out.println("The reversed both halvies of "+ num + " is " + reverse);

    }
}
