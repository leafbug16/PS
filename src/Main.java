import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            int tmp = sc.nextInt()%42;
            arr[i] = tmp;
        }

        int cnt = 10;

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (i != j && arr[i] != -1 && arr[j] != -1) {
                    if (arr[i] == arr[j]) {
                        arr[j] = -1;
                        cnt--;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}