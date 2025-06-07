import java.util.Scanner;

public class pattern_printing {

    void solid_rectangle(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void hollow_rectangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || j==1 || i==r||j==c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void triangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void inverse_triangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pyramid(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_printing obj=new pattern_printing();
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        //obj.solid_rectangle(r,c);
        //obj.hollow_rectangle(r,c);
        //obj.triangle(r,c);
        //obj.inverse_triangle(r,c);
        //obj.pyramid(r,c);
        obj.pattern(r,c);
    }
}
