import java.io.*;
import java.util.*;
public class ForbiddenIntegerProblem{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long K = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long grp = K / (x - 1);
            long rem = K % (x - 1);
            long ans = grp * x + rem;
            if(rem == 0){
                ans -= 1;
            }
            pw.println(ans);
        }
        pw.flush();
    }
}