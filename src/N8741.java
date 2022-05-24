
import java.util.Arrays;
import java.util.Scanner;
class N8741{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        String result;
        for(int test_case = 1; test_case <= T; test_case++) {
            String str=sc.next();
            String []arr=str.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String word : arr){
                sb.append(Character.toUpperCase(word.charAt(0)));
            }

            System.out.println("#" + test_case + " " + sb);
        }
    }
}