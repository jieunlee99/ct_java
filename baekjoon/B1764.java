package bj;

import java.io.*;
import java.util.*;

public class B1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> notListen = new HashSet<>();
        for(int i=0; i<n; i++) {
            notListen.add(br.readLine());
        }

        HashSet<String> notSee = new HashSet<>();
        for(int i=0; i<m; i++) {
            notSee.add(br.readLine());
        }

        notListen.retainAll(notSee); // 교집합
        System.out.println(notListen.size());
        notListen.stream().sorted().forEach(System.out::println);
    }
}
