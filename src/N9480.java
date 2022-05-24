
import java.util.Scanner;
class N9480{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int n=sc.nextInt();
            int arr[]=new int[27];
            for(int i=0;i<n;i++){
                String str=sc.next();
                for( char a:str.toCharArray()){
                    int index=a-96;
                    //System.out.println(index);
                    arr[index]++;
                }
            }
            for(int a:arr)
                System.out.println(a);
//            int cnt=0;
//            boolean flag=true;
//            while(flag) {
//                for (int i = 1; i <= 27; i++) {
//                    if (arr[i] == 0) {
//                        flag=false;
//                        break;
//                    }else {
//                        arr[i]--;
//                    }
//                }
//                cnt++;
//            }
            int sum=0;
            for(int i=0;i< arr.length;i++){
                sum+=arr[i];
            }
            int asd=sum/27;
            System.out.println("#"+test_case+" "+asd);
        }
    }
}