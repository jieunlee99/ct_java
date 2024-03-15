package bj;

// ref => https://st-lab.tistory.com/74

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int cross_count = 1; // 해당 대각선에서의 칸 개수
        int prev_count_sum = 0; // 직전 대각선까지의 칸 개수

        while(true) {
            if(x <= prev_count_sum + cross_count) {
                if(cross_count % 2 == 1) {
                    System.out.print(cross_count - (x-prev_count_sum-1) +"/"+(x-prev_count_sum));
                    break;
                } else {
                    System.out.print((x-prev_count_sum) +"/"+(cross_count-(x-prev_count_sum-1)));
                    break;
                }
            }
            else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

    }
}
