package bj;

// ref -> https://broship.tistory.com/200

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17103 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] primes = new boolean[1000001]; // 0~1000000

        // primes : false -> 소수, true -> 합성수
        primes[0] = true;
        primes[1] = true;
        for(int i=2; i<Math.sqrt(1000000); i++) {
            if(primes[i]) continue;
            for(int j=i*i; j<1000001; j+=i) {
                primes[j] = true;
            }
        }

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            for(int j=2; j<=n/2; j++) {
                if(!primes[j] && !primes[n-j]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}

// public class B17103 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());
//
//         for(int i=0; i<t; i++) {
//             int n = Integer.parseInt(br.readLine());
//             ArrayList<Integer> list = new ArrayList<>();
//
//             for(int j=2; j<n; j++) {
//                 if(isPrime(j)) list.add(j);
//             }
//
//             double count = 0;
//
//             for(int num1 : list) {
//                 int num2 = n - num1;
//                 if(list.contains(num2)) {
//                     if(num1 == num2)
//                         count += 1;
//                     else {
//                         count += 0.5;
//                     }
//                 }
//             }
//
//             System.out.println((int)count);
//         }
//     }
//
//     static boolean isPrime(int n) {
//         if(n == 0 || n == 1) return false;
//         for(int i=2; i<=Math.sqrt(n); i++) {
//             if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
