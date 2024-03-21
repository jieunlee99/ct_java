package bj;

import java.util.*;
import java.io.*;

public class B11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] array = new int[n][2]; // [x, y]를 n개 저장
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0]-e2[0];
            } else {
                return e1[1]-e2[1];
            }
        });

        for (int[] xy: array) {
            System.out.println(xy[0]+" "+xy[1]);
        }

        br.close();
    }
}
