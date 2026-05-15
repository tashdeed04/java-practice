import java.io.*;
import java.util.*;
public class ClosestPairSum{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokens.nextToken());
        int m = Integer.parseInt(tokens.nextToken());
        int target = Integer.parseInt(tokens.nextToken());
        int[] arrA = new int[n];
        int[] arrB = new int[m];
        tokens = new StringTokenizer(reader.readLine());
        for (int idx = 0; idx < n; idx++){
            arrA[idx] = Integer.parseInt(tokens.nextToken());
        }
        tokens = new StringTokenizer(reader.readLine());
        for (int idx = 0; idx < m; idx++){
            arrB[idx] = Integer.parseInt(tokens.nextToken());
        }
        int ansI = 0, ansJ = 0;
        int bestDiff = Integer.MAX_VALUE;
        int lp = 0;
        int rp = m - 1;
        while (lp < n && rp >= 0){
            int currSum = arrA[lp] + arrB[rp];
            int currDiff = Math.abs(currSum - target);
            if (currDiff < bestDiff){
                bestDiff = currDiff;
                ansI = lp + 1;
                ansJ = rp + 1;
            }
            if (currSum > target){
                rp--;
            }
            else if (currSum < target){
                lp++;
            }
            else{
                break;
            }
        }
        output.println(ansI + " " + ansJ);
        output.flush();
    }
}