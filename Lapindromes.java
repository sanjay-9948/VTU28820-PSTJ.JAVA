import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();
            int n = s.length();

            int[] count = new int[26];

            // First half
            for (int i = 0; i < n / 2; i++) {
                count[s.charAt(i) - 'a']++;
            }

            // Second half
            for (int i = (n + 1) / 2; i < n; i++) {
                count[s.charAt(i) - 'a']--;
            }

            boolean isLapindrome = true;

            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    isLapindrome = false;
                    break;
                }
            }

            if (isLapindrome) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
