import java.util.Scanner;
class N10059{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            String str=sc.next();
            int n=Integer.parseInt(str.substring(0,2));
            int m=Integer.parseInt(str.substring(2,4));
            if(n>12 && m>12 || n<=0 && m<=0){
                System.out.println("#"+test_case+" "+"NA");
                continue;
            } else if(n<=12 && m<=12) {
                System.out.println("#"+test_case+" "+"AMBIGUOUS");
                continue;
            }
            else if(m>12){
                System.out.println("#"+test_case+" "+"MMYY");
                continue;
            }else System.out.println("#"+test_case+" "+"YYMM");
        }
    }
}