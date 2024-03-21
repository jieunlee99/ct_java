package bj;

// ref -> https://st-lab.tistory.com/112

import java.io.*;
import java.util.*;

public class B1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] array = new String[n];

        for(int i=0; i<n; i++) {
            array[i] = br.readLine();
        }

        Arrays.sort(array, (word1, word2)->{
           if(word1.length() ==  word2.length()) { // 길이가 같으면 사전순 정렬
               return word1.compareTo(word2);
           } else { // 길이가 짧은게 먼저.
               return word1.length()-word2.length();
           }
        });

        System.out.println(array[0]);
        for (int i=1; i<n; i++) {
            if(array[i-1].equals(array[i])) { // 중복되는 문자열은 출력하지 않음
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
