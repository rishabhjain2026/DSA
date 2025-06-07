import java.util.*;
public class Taking_input {
    void Int_sum(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=Sc.nextInt();
        System.out.println("enter second number");
        int b=Sc.nextInt();

        int sum=a+b;
        System.out.println("the sum of "+a+" and "+b+" is "+sum);
    }

    void float_simple_interest(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter principal value");
        float p=Sc.nextFloat();
        System.out.println("enter rate");
        float r=Sc.nextFloat();
        System.out.println("enter time");
        float t=Sc.nextFloat();

        float SI=(p*r*t)/100;
        System.out.println("simple interest is "+SI);
    }

    public static void main(String[] args) {
        Taking_input obj=new Taking_input();
        //obj.Int_sum();
        //obj.float_simple_interest();

    }
}
