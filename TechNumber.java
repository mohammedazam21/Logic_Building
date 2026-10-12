import java.util.Scanner;

public class TechNumber {
    public static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int count=count(num);

        if(count(num)%2!=0){
            System.out.println("Not a Tech Number");
        }
        int power=(int)Math.pow(10, count/2);
        int fh=num/power;
        int sh=num%power;

        int sum=fh+sh;

        System.out.println((sum*sum==num)?"Tech Number":"Not a Tech Number");
    
        
    }
}
