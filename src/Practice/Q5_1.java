package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int sum = 0;
        int avg = 0;

        while (true) {
            int input = Integer.parseInt(st.nextToken());

            if (input == 0) {
                break;
            }

            if (input % 2 == 1) {
                cnt++;
                sum += input;
            }
        }

        avg = sum / cnt;

        System.out.println("홀수의 합 = " + sum);
        System.out.println("홀의 평균 = " + avg);
    }
}