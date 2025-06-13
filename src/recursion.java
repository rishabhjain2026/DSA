import java.util.Scanner;

public class recursion {
    static void natural_num(int n){
        if(n==0){
            return;
        }
        else {
            natural_num(n-1);
            System.out.println(n);
        }
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
    static int sum_of_digit(int n){
        if(0<n && n<=9){
            return n;
        }
        else{
            return ((n%10)+sum_of_digit(n/10));
        }
    }
    static int pow(int p,int q){
        if(q==1){
            return p;
        }
        else {
            return p*pow(p,q-1);
        }
    }
    static void k_multiple(int num,int k){
        if(k==0){
            return;
        }
        else {
            k_multiple(num,k-1);
            System.out.println(num*k);
        }
    }
    static int[] take_input(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array values");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    static void print_array(int []arr,int idx){
        if(idx==arr.length){
            return;
        }
        else {
            System.out.println(arr[idx]);
            print_array(arr,idx+1);
        }
    }
    static int sum(int []arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        else{
            return (arr[idx]+sum(arr,idx+1));
        }
    }
    static int target(){
        Scanner sc=new Scanner((System.in));
        System.out.println("enter target value");
        int target=sc.nextInt();
        return target;
    }
    static boolean find_x(int []arr,int target,int idx){
        if(idx>=arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
            return find_x(arr,target,idx+1);
    }
    static void find_index(int[]arr,int target,int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        find_index(arr,target,idx+1);
    }

    static String remove_a(String s,int idx){
        if(idx>=s.length()){
            return "";
        }
        if(s.charAt(idx)!='a'){
            return (s.charAt(idx)+remove_a(s,idx+1));
        }
        else{
            return remove_a(s,idx+1);
        }
    }

    static String remove_a2(String s){
        if(s.length()==0){
            return "";
        }
        if(s.charAt(0)!='a'){
            return (s.charAt(0)+remove_a2(s.substring(1)));
        }
        else{
            return remove_a2(s.substring(1));
        }
    }
    static String reverse(String s,int idx){
        if(idx>=s.length()){
            return "";
        }
        else{
            return (reverse(s,idx+1)+s.charAt(idx));
        }
    }
    static void is_String_palindrome(String s,String reverse){
        if(reverse.equals(s)){
            System.out.println("yes string is palindrome");
        }
        else{
            System.out.println("No string is not palindrome");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter number");
        //int n=sc.nextInt();

        //natural_num(n);
        //System.out.println(factorial(n));
        //System.out.println(fibonacci(n));
        //System.out.println(sum_of_digit(n));

//        System.out.println("enter power");
//        int q=sc.nextInt();
//        System.out.println(pow(n,q));

//        System.out.println("enter k");
//        int k=sc.nextInt();
//        k_multiple(n,k);

        //take_input(n);
        //print_array(take_input(n),0);
        //System.out.println(sum(take_input(n),0));
        //System.out.println(find_x(take_input(n),target(),0));
        //find_index(take_input(n),target(),0);

//        System.out.println("enter the string");
//        String s=sc.nextLine();
        //System.out.println(remove_a(s,0));
        //System.out.println(remove_a2(s));
        //System.out.println(reverse(s,0));
        //is_String_palindrome(s,reverse(s,0));
    }
}
