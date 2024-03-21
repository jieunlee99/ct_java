package bj;

import java.io.*;
import java.util.*;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> hab = (HashSet<Integer>) setA.clone();
        hab.addAll(setB); // 합집합
        setA.retainAll(setB); // 교집합
        System.out.println(hab.size()-setA.size()); // 합 - 교
    }
}
