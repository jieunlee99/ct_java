package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        int count = 0;
        for(int i=0; i<n; i++) {
            String cur = br.readLine();
            if(cur.equals("ENTER")) {
                count += set.size();
                set.clear();
                continue;
            }
            set.add(cur);
        }

        count += set.size();

        System.out.println(count);
    }
}
