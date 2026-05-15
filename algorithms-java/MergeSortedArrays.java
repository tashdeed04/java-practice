import java.util.*;
import java.io.*;
public class MergeSortedArrays{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        int[] a1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            a1[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] a2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            a2[i] = Integer.parseInt(st.nextToken());
        }
        int[] newArr = new int[N + M];
        int a1idx = 0;
        int a2idx = 0;
        int newArridx = 0;
        while(a1idx < N && a2idx < M){
            if(a1[a1idx] <= a2[a2idx]){
                newArr[newArridx] = a1[a1idx];
                a1idx++;
            }
            else{
                newArr[newArridx] = a2[a2idx];
                a2idx++;
            }
            newArridx++;
        }
        while(a1idx < N){
            newArr[newArridx] = a1[a1idx];
            a1idx++;
            newArridx++;
        }
        while(a2idx < M){
            newArr[newArridx] = a2[a2idx];
            a2idx++;
            newArridx++;
        }
        for(int i = 0; i < newArridx - 1; i++){
            pw.print(newArr[i] + " ");
        }
        pw.println(newArr[newArridx - 1]);
        pw.flush();
    }
}