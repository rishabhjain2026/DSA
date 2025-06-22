import java.util.Scanner;

public class Sorting_algorithum {

    static int[] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static void print(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    static void bubblesort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        print(a);
    }

    static void selectionsort(int []a){
        for(int i=0;i<a.length;i++){
            int min_index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min_index]>a[j]){
                    min_index=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
        print(a);
    }

    static void insertionsort(int []a){
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        print(a);
    }
    static void merge(int[]arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int []left=new int[n1];
        int []right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i,j,k;
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergesort(int []arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void swap(int []arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    static int partition(int []arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<pivot){
                count++;
            }
        }
        int pivot_index=st+count;
        swap(arr,st,pivot_index);
        int i=st;
        int j=end;
        while(i<pivot_index && j>pivot_index){
            if(arr[i]<arr[pivot_index]){
                i++;
            }
            if(arr[j]>arr[pivot_index]){
                j--;
            }
            if(i<pivot_index && j>pivot_index){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot_index;
    }
    static void quicksort(int []arr,int st,int end){
        if(st>=end){
            return;
        }
        int pi=partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);
    }

    static void countsort(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int []count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }

    static boolean binary_search(int []arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return true;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
    static int square_root(int n){
        int st=0;
        int end=n;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            int val=mid*mid;
            if(val==n){
                return mid;
            } else if (val>n) {
                end=mid-1;
            }
            else {
                ans=mid;
                st=mid+1;
            }
        }
        return ans;
    }
    static int find_min_Index(int []arr,int n){
        int st=0;
        int end=n-1;
        int ans=-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[end]){
                    ans=mid;
                    end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //bubblesort(input());
        //selectionsort(input());
        //insertionsort(input());

        int []arr=input();
        int n=arr.length;
//        mergesort(arr,0,n-1);
//        print(arr);

//        quicksort(arr,0,n-1);
//        print(arr);

//        countsort(arr);
//        print(arr);

        //System.out.println(binary_search(arr,5));
        //System.out.println(square_root(24));
        //System.out.println(find_min_Index(arr,n));

    }
}
