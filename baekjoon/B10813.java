package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        int tmp, x, y;
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken())-1;
            y = Integer.parseInt(st.nextToken())-1;
            tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
         }

        for (int num: arr) {
            System.out.print(num+" ");
        }
    }
}
