package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int oddCnt = 0;
        int evenCnt = 0;

        while (true) {
            int input = Integer.parseInt(st.nextToken());

            if (input == 0) {
                break;
            } else if (input > 0 && input % 2 == 1) {
                oddCnt++;
            } else if (input > 0 && input % 2 == 0) {
                evenCnt++;
            }
        }

        System.out.println("odd : " + oddCnt);
        System.out.println("even : " + evenCnt);
    }
}