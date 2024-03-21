package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        int[] array = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int num:array) {
            if(set.contains(num)) {
                System.out.print(1+" ");
            } else{
                System.out.print(0+" ");
            }
        }
    }
}
