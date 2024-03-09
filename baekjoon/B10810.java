package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // N: 바구니 개수, M: 반복문 횟수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int i, j, k;

        int[] basket = new int[N] ;

        for(int h=0; h<M; h++) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            for(int n=i; n<=j; n++) {
                basket[n - 1] = k;
            }
        }

        for (int num:basket) {
            System.out.print(num+" ");
        }
    }
}

