package bj;

// ref -> https://velog.io/@gayeong39/백준-4779-칸토어-집합JAVA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4779 {
    static char[] lineArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input;
        int n;
        while((input = br.readLine())!=null) {
            n = Integer.parseInt(input);
            sb = new StringBuilder();

            int len = (int)Math.pow(3, n);

            lineArr = new char[len];
            Arrays.fill(lineArr, '-');

            divide(0, len);

            for(int i=0; i<len; i++) {
                sb.append(lineArr[i]);
            }
            System.out.println(sb);
        }
    }

    static void divide(int start, int leng) {
        if(leng <= 1) return;

        int new_leng = leng/3;

        // 가운데 구역 -> 공백으로 바꾸기
        for(int i=start+new_leng; i<start+new_leng*2; i++) {
            lineArr[i] = ' ';
        }

        // 첫 번째 구역 -> 재귀
        divide(start, new_leng);

        // 세 번째 구역 -> 재귀
        divide(start+new_leng*2, new_leng);
    }
}
