import javax.lang.model.SourceVersion;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //삼각수 배열 만들기
        int res = 0;
        int[] eureka = new int[44];
        for (int i=1; i<45; i++) {
            res += i;
            eureka[i-1] = res;
        }

        int[] ans = new int[num];

        //탐색
        for (int i=0; i<arr.length; i++) {
            boolean discrimination = false;
            for (int i1=0; i1<eureka.length; i1++) {
                for (int i2=0; i2<eureka.length; i2++) {
                    for (int i3=0; i3<eureka.length; i3++) {
                        int sum = eureka[i1] + eureka[i2] + eureka[i3];
                        if (sum == arr[i]) {
                            discrimination = true;
                            break;
                        }
                    }
                }
            }
            if(discrimination) {
                ans[i] = 1;
            }
        }

        //출력
        for (int i=0; i<ans.length; i++) {
            bw.write(Integer.toString(ans[i]) + "\n");
        }
        bw.flush();
        
    }
}