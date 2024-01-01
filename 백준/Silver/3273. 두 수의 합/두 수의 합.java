import javax.lang.model.SourceVersion;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        arr = br.readLine().split(" ");
        int[] arr1 = new int[num];
        for (int i=0; i<num; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int res = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i=0; i<num-1; i++) {
            for (int j=i+1; j<num; j++) {
                if (arr1[i]+arr1[j] == res) {
                    cnt++;
                    break;
                }
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();

    }
}