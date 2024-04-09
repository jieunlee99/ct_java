package bj;

// ref -> https://stdio-han.tistory.com/92

// N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
// N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

import java.io.*;

public class B9663 {
    static int n;
    static int[] arr; // 인덱스는 행, 값은 열을 의미
    static int count = 0; // 결과 값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        backtracking(0);

        System.out.println(count);
    }

    public static void backtracking(int depth) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (possible(depth)) { // 해당 위치에 퀸을 놓을 수 있다면 다음 depth 탐색
                backtracking(depth + 1);
            }
        }
    }

    // 퀸을 놓을 수 있는 위치인지 확인해준다.
    public static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            // 같은 행에 퀸이 있는지
            if (arr[i] == arr[col]) {
                return false;
            }
            // 대각선에 퀸이 있는지 확인한다.
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        // 둘다 없다면 true
        return true;
    }
}
