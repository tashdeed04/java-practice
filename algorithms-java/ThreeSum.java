import java.io.*;
import java.util.*;
public class ThreeSum{
    static class ThreeSum {
        int val;
        int idx;
        Pair(int v, int i) {
            val = v;
            idx = i;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokens.nextToken());
        long target = Long.parseLong(tokens.nextToken());
        tokens = new StringTokenizer(reader.readLine());
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++){
            arr[i] = new Pair(Integer.parseInt(tokens.nextToken()), i + 1);
        }
        Arrays.sort(arr, Comparator.comparingInt(p -> p.val));
        for (int i = 0; i < n - 2; i++){
            int lp = i + 1;
            int rp = n - 1;
            while (lp < rp){
                long sum = (long) arr[i].val +
                           arr[lp].val +
                           arr[rp].val;
                if (sum == target){
                    output.println(arr[i].idx + " "
                                   + arr[lp].idx + " "
                                   + arr[rp].idx);
                    output.flush();
                    return;
                }
                if (sum < target){
                    lp++;
                } else {
                    rp--;
                }
            }
        }
        output.println(-1);
        output.flush();
    }
}