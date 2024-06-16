package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int sum = 0;
        double avg;

        while (true) {
            int input = Integer.parseInt(st.nextToken());

            if (0 > input || input > 100) {
                break;
            }

            cnt++;
            sum += input;
        }

        avg = (double) sum / cnt;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}