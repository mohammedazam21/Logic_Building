import java.util.Scanner;

public class CyclicPrime {
    public static boolean isPrime(int num){
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

    public static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }

    public static boolean checkCyclicPrime(int num){
        int count=count(num);
        int power=(int)Math.pow(10, count-1);
        while(count>0){
            if(isPrime(num)){
                int ld=num%10;
                int rem=num/10;
                num=ld*power+rem;
                count--;

            }
            else{
                return false;
            }
        }
        return count==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to check for CyclicPrime or not ");
        int num=sc.nextInt();

        System.out.println(checkCyclicPrime(num));


    }
}
