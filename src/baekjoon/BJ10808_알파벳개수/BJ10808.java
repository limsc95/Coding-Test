package baekjoon.BJ10808_알파벳개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder answer = new StringBuilder();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            answer.append(arr[i]);
            if (i < 25){
                answer.append(" ");
            }
        }

        System.out.println(answer);
    }
}
