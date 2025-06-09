import java.util.Scanner;

public class array_basic {
    static int sum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
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

    static int [] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        System.out.println("elements are");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        return arr;
    }

    static int [][] two_dimension_input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        System.out.println("enter number of column");
        int c=sc.nextInt();
        System.out.println("enter values");
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static void print_two_dimension_array(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
    static int pair_sum(int []arr){
        int count=0;
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    static int triplet_sum(int []arr){
        int count=0;
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int no_duplicate(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>-1){
                ans=arr[i];
            }
        }
        return ans;
    }
    static void swap_number(int []arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);
    }
    static int[] reverse_array(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap_number(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    static void print_array(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotate_array(int []arr){
        int j=0;
        int k=2;
        int n=arr.length;
        k=k%n;
        int []ans=new int[arr.length];
        for(int i=n-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<=k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static int[] sort_zero_and_one1(int []arr){
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }

    static int[] sort_zero_and_one2(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap_number(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
        return arr;
    }
    static int[] sort_even_odd(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]%2==1 && arr[j]%2==0){
                swap_number(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2==1){
                j--;
            }
        }
        return arr;
    }
    static int[] prefix_sum(int []arr){
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    static int n_query_prefix_sum(int []arr,int l,int r){
        int ans=0;
        ans=arr[r]-arr[l-1];
        return ans;
    }

    static boolean partition_sum(int [] arr){
        int total_sum=sum(arr);
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix=prefix+arr[i];
            int suffix=total_sum-prefix;
            if(prefix==suffix){
                return true;
            }
        }
        return false;
    }
    static int [][] add_two_matrix(){
        int [][]arr1=two_dimension_input();
        int [][]arr2=two_dimension_input();
        return add_matrix(arr1,arr2);
    }

    static int [][]add_matrix(int [][]arr1,int[][]arr2){
        if(arr1.length!=arr2.length && arr1[0].length!=arr2[0].length){
            System.out.println("wrong input");
        }
        int [][]sum=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
    static void multiply_matrix(){
        int arr1[][]=two_dimension_input();
        int arr2[][]=two_dimension_input();
        print_two_dimension_array(multiply(arr1,arr2));
    }
    static int[][] multiply(int [][]arr1,int [][]arr2){
        if(arr1[0].length!=arr2.length){
            System.out.println("wrong input");
        }
        int [][]mult=new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    mult[i][j]+=arr1[i][k]*arr2[k][j];
                }

            }
        }
        return mult;
    }

    static void transpose_matrix(){
        int [][]arr=two_dimension_input();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print_two_dimension_array(arr);
    }
    static void spiral_order(){
        int [][]arr=two_dimension_input();
        int r=arr.length;
        int c=arr[0].length;
        int count=0;
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        int mu=r*c;
        while(count<r*c){
            for(int i=left;i<=right && count<mu;i++){
                System.out.print(arr[top][i]+" ");
                count++;
            }
            top++;

            for(int i=top;i<=bottom && count<mu;i++){
                System.out.print(arr[i][right]+" ");
                count++;
            }
            right--;

            for(int i=right;i>=left && count<mu;i--){
                System.out.print(arr[bottom][i]+" ");
                count++;
            }
            bottom--;

            for(int i=bottom;i>=top && count<mu;i--){
                System.out.print(arr[i][left]+" ");
                count++;
            }
            left++;
        }
    }
    static void n_square_spiral_matrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        int r=arr.length;
        int c=arr[0].length;
        int count=0;
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        int mu=r*c;
        int value=1;
        while(count<r*c){
            for(int i=left;i<=right && count<mu;i++){
                arr[top][i]=value;
                count++;
                value++;
            }
            top++;

            for(int i=top;i<=bottom && count<mu;i++){
                arr[i][right]=value;
                count++;
                value++;
            }
            right--;

            for(int i=right;i>=left && count<mu;i--){
                arr[bottom][i]=value;
                count++;
                value++;
            }
            bottom--;

            for(int i=bottom;i>=top && count<mu;i--){
                arr[i][left]=value;
                count++;
                value++;
            }
            left++;
        }
        print_two_dimension_array(arr);
    }



    public static void main(String[] args) {
        array_basic obj=new array_basic();
        //System.out.println(sum(obj.input()));
        //obj.maximum();
        //obj.search();
        //obj.input();
        //obj.count();
        //obj.lastoccuraance();
        //System.out.println(is_sorted());
        //System.out.println("Total pair are "+pair_sum(obj.input()));
        //System.out.println("total triplet are "+triplet_sum(obj.input()));
        //System.out.println(no_duplicate(obj.input()));
        int a=3;
        int b=5 ;
        //swap_number(a,b);
        //print_array(reverse_array(obj.input()));
        //print_array(rotate_array(obj.input()));
        //print_array((sort_zero_and_one1(obj.input())));
        //print_array(sort_zero_and_one2(obj.input()));
        //print_array(sort_even_odd(obj.input()));
        //print_array(prefix_sum(obj.input()));

//        int [] arr=prefix_sum(obj.input());
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number of query");
//        int q=sc.nextInt();
//        while(q-->0){
//            System.out.println("enter first index");
//            int l=sc.nextInt();
//            System.out.println("enter last index");
//            int r=sc.nextInt();
//            System.out.println("sum from index "+l+" to "+r+" is "+n_query_prefix_sum(arr,l,r));
//        }

        //System.out.println(partition_sum(obj.input()));

        //print_two_dimension_array(two_dimension_input());
        //print_two_dimension_array(add_two_matrix());
        //multiply_matrix();
        //transpose_matrix();
        //spiral_order();
        //n_square_spiral_matrix();
    }
}
