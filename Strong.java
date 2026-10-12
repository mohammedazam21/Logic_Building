import java.util.Scanner;

public class Strong {
    public static int factorial(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
        
                fact*=i;
        }
        return fact;
    }
    public static boolean checkStrong(int num){
        int temp=num;
        int sum=0;
        while(num!=0){
            int ld=num%10;
            sum=sum+factorial(ld);
            num/=10;
        }
        return temp==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int num=sc.nextInt();

        System.out.println(checkStrong(num)?"Strong Number":"Not a Strong Number");
    }
}
