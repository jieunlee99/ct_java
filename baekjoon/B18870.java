package bj;

// ref -> https://kkungchan.tistory.com/302

import java.util.*;
import java.io.*;

public class B18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            array[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;
        for(int value : sorted) {
            if(!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int value:array) {
            sb.append(rankMap.get(value)).append(' ');
        }
        System.out.println(sb);
    }
}

// // 시간 초과
// public class B18870 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//
//         int n = Integer.parseInt(br.readLine());
//
//         int[] array = new int[n];
//         TreeSet<Integer> set = new TreeSet<>();
//
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         for(int i=0; i<n; i++) {
//             array[i] = Integer.parseInt(st.nextToken());
//             set.add(array[i]);
//         }
//
//         Integer[] index = set.toArray(new Integer[0]); // 0으로 해야 자동으로 크기 맞춰줌(?)
//
//         for (int a : array) {
//             for(int i=0; i<index.length; i++) {
//                 if(a == index[i]) {
//                     sb.append(i+" ");
//                     break;
//                 }
//             }
//         }
//         System.out.println(sb);
//     }
// }
