package bj;

import java.io.*;
import java.util.*;
import java.util.stream.*;

// 1. Map: 각 알파벳 사용 개수.
// 2. ArrayList: 최대값을 가진 key
// 3. ArrayList의 크기에 따라
    // 3-1. 크기가 1이면 그 key 값을 출력하
    // 3-2. 1보다 크다면 "?" 출력


public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().toUpperCase().split("");

        Map<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (String s: str) {
            map.put(s, map.getOrDefault(s, 0)+1);
            max = Math.max(max, map.get(s));
        }

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        if(list.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(list.get(0));
        }
    }
}
