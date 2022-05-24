import java.util.Scanner;
class N10570{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            boolean arr[]=new boolean[1001];
            for(int num=1;num<=35;num++){
                if(is_par(String.valueOf(num)) && is_par(String.valueOf(num*num))){
                    arr[num*num]=true;
                }
            }
//            for (boolean value : arr) {
//                System.out.println(value);
//            }
            int a=sc.nextInt();
            int b=sc.nextInt();
            int cnt=0;
            for(int i=a;i<=b;i++){
                if(arr[i]){
                    cnt++;
                }
            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }
    static boolean is_par(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            return true;
        }
        else return false;
    }
}