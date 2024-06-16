package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int sum = 0;
        double avg = 0;

        while (true) {
            int input = Integer.parseInt(st.nextToken());

            cnt++;
            sum += input;

            if (input >= 100) {
                break;
            }
        }

        avg = (double) sum / cnt;

        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}