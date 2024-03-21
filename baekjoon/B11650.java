package bj;

// ref -> https://kkungchan.tistory.com/297

import java.io.*;
import java.util.*;

public class B11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] xy = new int[n][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xy[i][0] = Integer.parseInt(st.nextToken()); // x
            xy[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        Arrays.sort(xy, (e1, e2)-> {
            if(e1[0] == e2[0]) { // x 값이 같을 땐 y 값으로 비교
                return e1[1]-e2[1];
            } else{ // x 값이 다를 땐 x 값으로 비교
                return e1[0]-e2[0];
            }
        });

        for (int[] e: xy) {
            System.out.println(e[0]+" "+e[1]); // x y
        }
    }
}
