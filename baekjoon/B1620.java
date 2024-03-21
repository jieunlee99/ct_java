package bj;

// ref 1 -> https://kne-coding.tistory.com/236
// ref 2 -> https://chobo24.tistory.com/entry/백준-1620번-나는야-포켓몬-마스터-이다솜-JAVA자바

import java.io.*;
import java.util.*;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1. 두 개 다 map을 쓰기
        // 2. nameMap과 배열을 만드는 방법 (메모리가 더 조금 사용된다 함)
        HashMap<String, Integer> nameMap = new HashMap<>();
        HashMap<Integer, String> numMap = new HashMap<>();

        // 도감 입력
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameMap.put(name, i);
            numMap.put(i, name);
        }

        // 시험
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if(Character.isDigit(str.charAt(0))) {
                int num = Integer.parseInt(str);
                bw.write(numMap.get(num)+"\n");
            } else {
                bw.write(nameMap.get(str)+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
