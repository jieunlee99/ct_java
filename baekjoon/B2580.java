package bj;

// ref -> https://st-lab.tistory.com/119

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2580 {
    static StringBuilder sb = new StringBuilder();
    static int[][] sudoku = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtracking(0, 0);

        System.out.println(sb);
    }

    public static void backtracking(int row, int col) {

        // 해당 행을 다 채우면, 다음 행 시작
        if(col == 9) {
            backtracking(row+1, 0);
            return;
        }

        // 모두 채웠으면 종료시킴
        if(row == 9) {
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    sb.append(sudoku[i][j]).append(" ");
                }
                sb.append("\n");
            }
            return;
        }

        // 값을 채워줘야 한다면 탐색
        if(sudoku[row][col] == 0) {
            for(int val=1; val<=9; val++) {
                if(isPossible(row, col, val)) {
                    sudoku[row][col] = val;
                    backtracking(row, col+1);
                }
            }
            sudoku[row][col] = 0;
            return;
        }

        // 안 채워줘도 되는 칸이면 다음 칸 탐색
        backtracking(row, col+1);
    }

    public static boolean isPossible(int row, int col, int val) {
        // 같은 행 검사
        for(int i=0; i<9; i++) {
            if(sudoku[row][i] == val) {
                return false;
            }
        }

        // 같은 열 감사
        for(int i=0; i<9; i++) {
            if(sudoku[i][col] == val) {
                return false;
            }
        }

        // 3x3 검사
        int x = (row/3)*3; // val이 속한 3x3 행의 첫 위치
        int y = (col/3)*3; // val이 속한 3x3 행의 첫 위치
        for(int i=x; i<x+3; i++) {
            for(int j=y; j<y+3; j++) {
                if(sudoku[i][j] == val) {
                    return false;
                }
            }
        }

        // 모든 조건 검사를 통과하면 true
        return true;
    }
}
