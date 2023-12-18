import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int[] b = new int[5];
        int tmp = 0;
        for (int i=0; i<a.length; i++) {
            b[i] = Integer.parseInt(a[i]) * Integer.parseInt(a[i]);
            tmp += b[i];
        }
        System.out.println(tmp%10);
    }
}