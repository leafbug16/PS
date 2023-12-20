import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int a = N % H;
            int b = N / H;
            if (a == 0) {
                System.out.printf("%d%02d\n", H, b);
            } else {
                System.out.printf("%d%02d\n", a, b+1);
            }
        }

    }
}