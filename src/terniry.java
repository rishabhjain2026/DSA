import java.util.Scanner;

public class terniry {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=Sc.nextInt();
        String ans=(a%2==0)?"even":"odd";
        System.out.println(ans);
    }
}
