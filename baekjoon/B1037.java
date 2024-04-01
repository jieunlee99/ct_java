package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<count; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.comparingInt(a -> a));

        System.out.println(list.get(0)*list.get(list.size()-1));
    }
}
