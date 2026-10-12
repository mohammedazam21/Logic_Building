import java.util.Scanner;

public class perfectNumber {
    public static boolean isPerfect(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return num==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num=sc.nextInt();
        System.out.println(isPerfect(num)?"Perfect Number":"Not a Perfect Number");
    }
}
