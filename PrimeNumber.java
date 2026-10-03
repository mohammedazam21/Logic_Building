import java.util.Scanner;

public class PrimeNumber {
    public static boolean checkPrime(int num){
        if(num<2)
            return false;
        int cf=2;
         for(int i=2;i<=num/2;i++){
            if(num%i==0){
                cf++;
                break;
            }
         }
         return cf==2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to check for prime or not ");
        int num=sc.nextInt();

        System.out.println(checkPrime(num)?"Prime Number":"Not a Prime number");


    }
}
