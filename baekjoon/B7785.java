package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        String name, status;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            name = st.nextToken();
            status = st.nextToken();

            if(status.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        set.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
