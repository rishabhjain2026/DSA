import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=1;
        int ans=0;
        while(n>0){
            int parity=n%2;
            ans+=parity*pow;
            pow*=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
