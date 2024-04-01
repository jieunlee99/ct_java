package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        int n = Integer.parseInt(br.readLine());
        String a, b;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = st.nextToken();
            b = st.nextToken();
            if(set.contains(a)) {
                set.add(b);
            } else if(set.contains(b)) {
                set.add(a);
            }
        }

        System.out.println(set.size());
    }
}
