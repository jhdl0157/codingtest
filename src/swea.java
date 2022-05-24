import java.util.*;
import java.io.*;

public class swea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int cnt=0;
            int min=99999999;
            int n=sc.nextInt();
            int [] map=new int[n+1];
            for(int i=0;i<n;i++) {
                int a = sc.nextInt();
                map[i] = Math.abs(a);
            }
            Arrays.sort(map);
            for(int i=0; i<n; i++){
                if(map[i+1]==map[i]){
                    cnt++;
                }else break;
            }
            System.out.println("# :"+cnt);
        }
    }
}
