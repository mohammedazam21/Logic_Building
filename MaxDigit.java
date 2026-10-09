import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int num=sc.nextInt();
        int max=0;

        while(num!=0){
            int ld=num%10;
            if(ld>max){
                max=ld;
            }
            num/=10;
        }
        System.out.println(max);


    }
}
