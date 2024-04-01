package bj;

// ref -> https://velog.io/@gayeong39/백준-24060-알고리즘-수업-병합-정렬-1-JAVA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24060 {

    // 변수를 static으로 쓰니까 시간초과 안뜸
    static int cnt = 0;
    static int k;
    static int result = -1;
    static int[] arr, tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, n-1);

        System.out.println(result);
    }

    static void merge_sort(int[] arr, int p, int r) {
        if(cnt > k) return; // 저장횟수가 필요한 횟수보다 많아지면 종료시킨다.
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    static void merge(int[] arr, int p, int q, int r) {
        int i = p; // 앞쪽 배열 시작점
        int j = q + 1; // 뒤쪽 배열 시작점
        int t = 0; // tmp 시작점


        while (i <= q && j <= r) {
            if (arr[i] < arr[j]) tmp[t++] = arr[i++];
            else tmp[t++] = arr[j++];
        }

        while (i <= q) tmp[t++] = arr[i++];
        while (j <= r) tmp[t++] = arr[j++];

        i = p;
        t = 0;

        while (i <= r) { // tmp에 저장된 정렬값을 arr로 옮기기
            cnt++;

            if(cnt == k) {
                result = tmp[t];
                break;
            }

            arr[i++] = tmp[t++];
        }
    }
}
