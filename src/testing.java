public class testing {
    public static void main(String[] args) {
        int sum=0;

//        sum of integer using while loop
//        for(int i=0;i<=5;i++){
//            sum+=i;
//        }


//        sum of integer using while loop
//        int i=0;
//        while(i<5){
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);

//        for(int i=0;i<50;i++){  // using continue
//            if(i%3==0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        int num=123;
//        int digit=0;
//        while(num>0){
//            num/=10;
//            digit++;
//        }
//        System.out.println(digit);

        int n=1234;
        int digit=0;
        while(n>0){
            int unit=n%10;
            digit=unit+(digit*10);
            n/=10;
        }
        System.out.println(digit);



    }
}
