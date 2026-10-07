import java.util.Scanner;

public class AutomorphicNum {
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
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=count(num);
        int power=(int)Math.pow(10,count);
        int sq=num*num;
        if(sq%power==num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not a Automorphic Number");

    
}
}
