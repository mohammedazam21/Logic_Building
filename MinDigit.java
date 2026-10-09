import java.util.Scanner;

public class MinDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int num=sc.nextInt();

        int min=9;

        while(num!=0){
            int ld=num%10;
            if(ld<min)
                min=ld;
            num/=10;
        }
        System.out.println(min);
    }
}
