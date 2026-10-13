import java.util.Scanner;

public class Palindrome {
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
        System.out.println("Enter a Number to check for palindrome ");
        int num=sc.nextInt();

        System.out.println((num==reverse(num))?"Palindrome Number":"Not a Palindrome Number");

    }
}
