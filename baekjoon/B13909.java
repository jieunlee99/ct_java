package bj;

// ref -> https://velog.io/@gayeong39/백준-13909-창문-닫기-JAVA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 약수의 개수가 홀수인 경우(열고-닫고-열기), 마지막에는 열려있다.
        // -> n까지의 숫자 중에서 약수의 개수가 홀수인 숫자를 찾으면 된다.
        // -> 약수가 홀수인 것은 제곱수인 경우 밖에 없다.
        // -> 따라서 n이하의 제곱수의 개수를 세면 된다.

        int cnt = 0;
        for(int i=1; i*i<=n; i++) {
            cnt++;
        }

        System.out.println(cnt);
    }
}

// // 메모리 초과
// public class B13909 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//         int n = Integer.parseInt(br.readLine());
//         boolean[] isOpen = new boolean[n];
//
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n; j+=i) {
//                 isOpen[j-1] = !isOpen[j-1];
//             }
//         }
//
//         int cnt = 0;
//         for(int i=0; i<n; i++) {
//             if(isOpen[i]) cnt++;
//         }
//
//         System.out.println(cnt);
//     }
// }
