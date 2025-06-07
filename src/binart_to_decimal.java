import java.util.Scanner;

public class binart_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int pow=1;
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans=ans+(digit * pow);
            n=n/10;
            pow=pow*2;
        }
        System.out.println(ans);
    }
}
