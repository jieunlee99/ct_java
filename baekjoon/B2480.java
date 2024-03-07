package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) System.out.println(10000+a*1000); // a, b, c가 모두 같을 때
        // 두 개만 같을 때
        else if(a == b) System.out.println(1000+a*100);
        else if(b == c) System.out.println(1000+b*100);
        else if(a == c) System.out.println(1000+a*100);
        else { // a, b, c 모두 다를 때
            if (a>b && a>c) System.out.println(a*100); // a가 제일 큼
            else if (b>a && b>c) System.out.println(b*100); // b가 제일 큼
            else System.out.println(c*100); // c가 제일 큼
        }
    }
}
