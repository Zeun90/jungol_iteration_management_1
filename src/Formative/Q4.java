package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        while (true) {
            int input = Integer.parseInt(st.nextToken());

            if (input == 0) {
                break;
            } else if (!(input % 3 == 0 || input % 5 == 0)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}