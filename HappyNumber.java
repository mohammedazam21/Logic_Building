import java.util.Scanner;

public class HappyNumber {
    public static boolean checkHappy(int num){
        int sum=0;
        while(num!=1 && num!=4 ){
            while(num!=0){
                int ld=num%10;
                sum=ld*ld;
                num/=10;
            }
            num=sum;
        }
        return num==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        System.out.println(checkHappy(num)?"Happy Number":"Not a Happy Number");
    }
}
