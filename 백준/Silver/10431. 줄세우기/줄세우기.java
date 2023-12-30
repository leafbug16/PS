import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][22];
        for (int i=0; i<num; i++) {
            for (int j=0; j<21; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //로직
        for (int i=0; i<num; i++) {
            for (int j=2; j<21; j++) {
                for (int k=j-1; k>0; k--) {
                    if (arr[i][k] < arr[i][j]) break;
                    if (arr[i][k] > arr[i][j]) {
                        int tmp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = tmp;
                        arr[i][21]++;
                        j--;
                    }
                }
            }
        }


        //출력
        for (int i=0; i<num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][21]);
        }
        
    }
}