package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println(min+" "+max);
    }
}
