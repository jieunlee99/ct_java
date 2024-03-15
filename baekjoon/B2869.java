package bj;

import java.io.*;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // int i=1;
        // while (true) {
        //     if(V <= A*i-B*(i-1)) {
        //         break;
        //     }
        //     i++;
        // }

        int day = (V-B)/(A-B);
        if((V-B)%(A-B) != 0) day++;

        bw.write(day+"\n");
        bw.flush();
        bw.close();
    }
}
