import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        for (int i=0; i<8; i++) {
            num[i] = sc.nextInt();
        }
        String res = "";
        for (int i=0; i<7; i++) {
            if (num[i] - num[i+1] != 1 && num[i] - num[i+1] != -1) {
                res = "mixed";
                break;
            } else if (num[i] - num[i+1] == 1) {
                res = "descending";
            } else {
                res = "ascending";
            }
        }
        System.out.println(res);
    }
}