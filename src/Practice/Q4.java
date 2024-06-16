package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;
        int sum = 0;
        double avg = 0;

        st = new StringTokenizer(br.readLine());

        while (true) {
            int input = Integer.parseInt(st.nextToken());

            if (input == 0) {
                break;
            }

            cnt++;
            sum += input;
        }

        avg = (double) sum / cnt;

        System.out.println("입력된 자료의 개수 = " + cnt);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의 평균 = %.2f", avg);
    }
}