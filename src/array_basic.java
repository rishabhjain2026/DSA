import java.util.Scanner;

public class array_basic {
    void sum(){
        int []arr={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    void maximum(){
        int []arr={1,2,3,8,4,5,6};
        int maximum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("maximum value is "+maximum);
    }

    void search(){
        int []arr={1,2,3,4,5,6};
        int target=4;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("elements are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void count(){
        int []arr={1,2,3,4,5,4,6};
        int target=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
    void lastoccuraance(){
        int []arr={1,2,3,4,5,4,4,6};
        int target=4;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println(index);
    }
    static boolean is_sorted(){
        boolean flag=true;
        int []arr={1,2,3,4,5,4,4,6};
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                flag=false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        array_basic obj=new array_basic();
        //obj.sum();
        //obj.maximum();
        //obj.search();
        //obj.input();
        //obj.count();
        //obj.lastoccuraance();
        System.out.println(is_sorted());
    }
}
