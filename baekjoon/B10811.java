package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        int[] new_basket = new int[N];
        int x, y, tmp;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken()) - 1;
            y = Integer.parseInt(st.nextToken()) - 1;
            while (x < y) {
                tmp = basket[x];
                basket[x] = basket[y];
                basket[y] = tmp;
                x++;
                y--;
            }
        }
        for (int b : basket) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
