package bj;

// ref -> https://lasbe.tistory.com/134

import java.io.*;

public class B2447 {

    static String[][] arr = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];

        drawStar(0, 0, n);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                // 아무것도 저장되지 않았을 때 공백 출력
                bw.write((arr[i][j] != null) ? arr[i][j] : " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    static void drawStar(int x, int y, int n) {

        // 최소 단위일 때 "*"을 저장한다.
        if(n == 1) {
            arr[x][y] = "*";
            return;
        }

        // 이 부분이 이해가 안됨 ㅡㅡ;;

        // n이 1이 될 때까지 3*3 크기로 분할한다.
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                // 가운데 빈공간이면 건너뛰기
                if(!(i==1 && j==1)) {
                    drawStar(x+i*n/3, y+j*n/3, n/3);
                }
            }
        }
    }
}
