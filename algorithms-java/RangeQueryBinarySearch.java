import java.io.*;
import java.util.*;
public class RangeQueryBinarySearch{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int query = 0; query < Q; query++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int lo = 0;
            int hi = N;
            while(lo < hi){
                int mid = (lo + hi) / 2;
                if(arr[mid] >= L){
                    hi = mid;
                }
                else{
                    lo = mid + 1;
                }
            }
            int leftIdx = lo;
            lo = 0;
            hi = N;
            while(lo < hi){
                int mid = (lo + hi) / 2;
                if(arr[mid] > R){
                    hi = mid;
                }
                else{
                    lo = mid + 1;
                }
            }
            int rightIdx = lo;
            pw.println(rightIdx - leftIdx);
        }
        pw.flush();
    }
}