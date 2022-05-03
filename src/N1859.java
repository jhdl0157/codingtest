import java.util.Scanner;
import java.io.FileInputStream;
class N1859
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception
    {

        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++) a[i] = sc.nextInt();
            long sum = 0;
            int max = a[N-1];
            for(int i=N-2; i>=0; i--) {
                if( a[i] > max ) max = a[i];
                else sum += max - a[i];
            }
            System.out.format( "#%d %d\n", test_case, sum );
        }
    }
}
