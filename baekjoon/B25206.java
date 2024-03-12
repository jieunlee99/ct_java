package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double totalSum = 0;
        double creditSum = 0;

        double credit;
        String grade;

        double doubleGrade;


        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            grade = st.nextToken();
            if(grade.equals("P"))
                continue;
            doubleGrade = doubleGrade(grade);

            creditSum += credit;

            totalSum += credit * doubleGrade;
        }

        System.out.println(String.format("%.6f", totalSum/creditSum));
    }

    static double doubleGrade(String grade) {
        if (grade.equals("A+")) return 4.5;
        else if (grade.equals("A0")) return 4.0;
        else if (grade.equals("B+")) return 3.5;
        else if (grade.equals("B0")) return 3.0;
        else if (grade.equals("C+")) return 2.5;
        else if (grade.equals("C0")) return 2.0;
        else if (grade.equals("D+")) return 1.5;
        else if (grade.equals("D0")) return 1.0;
        else return 0.0;
    }
}
