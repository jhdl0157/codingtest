
import java.util.Scanner;
class N8658{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();
        for(int test_case = 1; test_case <= T; test_case++) {
            String str= sc.nextLine();
            String[] stars=str.split(" ");
            int max=0;
            int min=999999999;
            for(String s:stars){
                int sum=0;
                    for(char c :s.toCharArray()){
                        sum+=c-48;
                    }
                    if(max<sum) max=sum;
                    if(min>sum) min=sum;

            }
            System.out.println("#"+test_case+" "+max+" "+min );
        }
    }
}