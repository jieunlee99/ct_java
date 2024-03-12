package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        ArrayList<String> list;
        boolean isGroup;
        String[] word;

        for(int i=0; i<n; i++) {
            word = br.readLine().split("");
            isGroup = true;
            list = new ArrayList<>();

            for(int j=0; j<word.length; j++) {
                if(!list.contains(word[j])) {
                    list.add(word[j]);
                } else {
                    if(!word[j-1].equals(word[j])) isGroup = false;
                }
            }

            if(isGroup) count += 1;
        }

        System.out.println(count);
    }
}
