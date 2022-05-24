import java.util.Scanner;
class N9700{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            float p= sc.nextFloat();
            float q=sc.nextFloat();
            System.out.println("#"+test_case+" "+((p*(1-q)*q>(1-p)*q)?"Yes":"No"));
        }
    }
}