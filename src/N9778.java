import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            int arr[]=new int[12];
            for(int i=2;i<=11;i++) {
                arr[i]=4;
            }
            arr[10]=16;
            int n=Integer.parseInt(br.readLine());
            int sum=0;
            for(int i=0;i<n;i++){
                int index=Integer.parseInt(br.readLine());
                sum+=index;
                arr[index]--;
            }
            sum=21-sum;
            int go=0;
            int stop=0;
            System.out.println(sum);
            for(int i=2;i<=11;i++){
                if(i<=sum){
                    go=go+arr[i];
                }else {
                    stop=stop+arr[i];
                }
            }
            System.out.println("#"+test_case+" "+((go>stop)?"GAZUA":"STOP"));
        }
    }
}
