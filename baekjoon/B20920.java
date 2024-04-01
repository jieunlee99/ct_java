package bj;

import java.io.*;
import java.util.*;

public class B20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        HashMap<String, Integer> dict = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String word;
        for (int i = 0; i < n; i++) {
            word = br.readLine();
            if (word.length() >= m)
                dict.put(word, dict.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(dict.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())) {
                    if (o1.getKey().length() == o2.getKey().length()) {
                        return o1.getKey().compareTo(o2.getKey());
                    } else {
                        return o2.getKey().length() - o1.getKey().length();
                    }
                } else {
                    return o2.getValue() - o1.getValue();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry:entryList) {
            sb.append(entry.getKey()).append("\n");
        }
        System.out.print(sb);
    }
}
