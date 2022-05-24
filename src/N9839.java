import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
class N9839{
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int T=Integer.parseInt(br.readLine());
       String arr[];
       int arrNum[];

        for(int test_case = 1; test_case <= T; test_case++) {
            int n=Integer.parseInt(br.readLine());
            arr=br.readLine().split(" ");
            arrNum=new int[arr.length];

            for(int j=0;j<arr.length;j++){
                arrNum[j]=Integer.parseInt(arr[j]);
            }
            int maxMulti = -1;
            for(int j=0;j<arrNum.length-1;j++){
                int x=arrNum[j];
                for(int z=j+1;z<arrNum.length;z++){
                    int y=arrNum[z];
                    int t=x*y;
                    int num=t%10; //일의 자리 추출 123-> 3;
                    boolean check = true; // 연속된 수인지 체크
                    t/=10; //일의 자리 버리기 123-> 12;
                    while (t > 0) {
                        if (t % 10 == num - 1) { //연속적일때
                            num--;
                        }else {
                            check=false;
                            break;
                        }
                        t/=10;
                    }
                    if(check&&maxMulti<x*y){
                        maxMulti=x*y;
                    }
                }
            }
            bw.write("#"+test_case+" "+maxMulti);
        }
        br.close();
        bw.close();
    }
}
