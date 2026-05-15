import java.util.*;
import java.io.*;
public class Task5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        long currSum = 0;
        int lp = 0;
        int rp = 0;
        int maxlen = 0;
        while(rp < N){
            currSum += arr[rp];
            while(currSum > K){
                currSum -= arr[lp];
                lp++;
            }
            maxlen = Math.max(maxlen, rp - lp + 1);
            rp++;
        }
        pw.println(maxlen);
        pw.flush();
    }
}