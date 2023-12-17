import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String now = sc.nextLine();
        String salt = sc.nextLine();
        String[] dividedNow = now.split(":");
        String[] dividedSalt = salt.split(":");
        int[] intNow = new int[dividedNow.length];
        int[] intSalt = new int[dividedSalt.length];
        int resHour = 0;
        int resMinute = 0;
        int resSecond = 0;

        for (int i=0; i<dividedNow.length; i++) {
            intNow[i] = Integer.parseInt(dividedNow[i]);
            intSalt[i] = Integer.parseInt(dividedSalt[i]);
        }

        if (intSalt[0] - intNow[0] < 0) {
            resHour = (24 - intNow[0] + intSalt[0]);
        } else {
            resHour = (intSalt[0] - intNow[0]);
        }

        if (intSalt[1] - intNow[1] < 0) {
            resHour--;
            resMinute = (60 - intNow[1] + intSalt[1]);
        } else {
            resMinute = (intSalt[1] - intNow[1]);
        }

        if (intSalt[2] - intNow[2] < 0) {
            resMinute--;
            resSecond = (60 - intNow[2] + intSalt[2]);
        } else {
            resMinute = (intSalt[2] - intNow[2]);
        }

        System.out.printf("%02d:%02d:%02d", resHour, resMinute, resSecond);
    }
}