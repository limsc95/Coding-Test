package baekjoon.BJ1978_소수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1978 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());

            if (s > 1){
                boolean decimal = true;
                for (int j = 2; j < s; j++){
                    if (s % j == 0){
                        decimal = false;
                        break;
                    }
                }
                if (decimal){count++;}
            }
        }
        System.out.println(count);
    }
}
