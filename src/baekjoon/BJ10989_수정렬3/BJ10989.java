package baekjoon.BJ10989_수정렬3;

import java.io.*;

public class BJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[x]++;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
