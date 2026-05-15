import java.util.*;
import java.io.*;
public class TwoSumTwoPointers{ 
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokens.nextToken());
        long requiredSum = Long.parseLong(tokens.nextToken());
        long[] num = new long[n];
        tokens = new StringTokenizer(reader.readLine());
        for (int idx = 0; idx < n; idx++) {
            num[idx] = Long.parseLong(tokens.nextToken());
        }
        int lp = 0;
        int rp = n - 1;
        while (lp < rp) {
            long currSum = num[lp] + num[rp];
            if (currSum == requiredSum) {
                output.println((lp + 1) + " " + (rp + 1));
                output.flush();
                return;
            }
            if (currSum < requiredSum) {
                lp++;
            } else {
                rp--;
            }
        }
        output.println(-1);
        output.flush();
    }
}