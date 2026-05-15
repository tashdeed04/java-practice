import java.io.*;
import java.util.*;
public class LongestKDistinctSubarray{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<Integer,Integer> found = new HashMap<>();
        int lp = 0;
        int rp = 0;
        int maxlen = 0;
        while(rp < N){
            found.put(arr[rp], found.getOrDefault(arr[rp], 0) + 1);
            while(found.size() > K){
                int cnt = found.get(arr[lp]) - 1;
                if(cnt == 0){
                    found.remove(arr[lp]);
                }
                else{
                    found.put(arr[lp], cnt);
                }
                lp++;
            }
            maxlen = Math.max(maxlen, rp - lp + 1);
            rp++;
        }
        pw.println(maxlen);
        pw.flush();
    }
}