import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=18){
            System.out.println("adult");
        } else if (num>10 && num<18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }
    }
}
