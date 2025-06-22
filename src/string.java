import java.util.*;
public class string {
    static void substring(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++) {
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
    static void toggle(String str1){
        StringBuilder str=new StringBuilder(str1);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean flag=true;
            int asci=(int) ch;
            if(ch==' '){
                continue;
            }
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char dh=(char) asci;
                str.setCharAt(i,dh);
            }
            else {
                asci-=32;
                char dh=(char) asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }

    static boolean is_palindrome(String sub){
        int i=0;
        int j=sub.length()-1;
        while(i<=j){
            if(sub.charAt(i)!=sub.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void count_palindrome(String str1){
        StringBuilder str=new StringBuilder(str1);
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                if(is_palindrome(str.substring(i,j))==true){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void reverse_string(String str){
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                ans+=sb.reverse();
                ans+=" ";
                sb=new StringBuilder("");
            }
        }
        ans+=sb.reverse();
        System.out.println(ans);
    }
    static void string_pattern(String str){
        StringBuilder sb=new StringBuilder(str.charAt(0));
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                    count=1;
                }
                sb.append(curr);

            }
        }
        if(count>1) {
            sb.append(count);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        //substring(str);
        //toggle(str);
        //count_palindrome(str);
        //reverse_string(str);
        //string_pattern(str);
    }
}
